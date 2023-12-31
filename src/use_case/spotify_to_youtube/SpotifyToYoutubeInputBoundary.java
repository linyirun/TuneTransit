package use_case.spotify_to_youtube;

import java.io.IOException;

public interface SpotifyToYoutubeInputBoundary {
    void execute(SpotifyToYoutubeInputData data);

    void connectToYoutube() throws IOException, InterruptedException;
}
