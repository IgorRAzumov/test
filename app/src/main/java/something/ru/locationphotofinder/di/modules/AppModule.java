package something.ru.locationphotofinder.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import something.ru.locationphotofinder.App;


@Singleton
@Module
public class AppModule {
    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    public Context context() {
        return app;
    }
}
