package appkite.jordiguzman.com.popularmovies_stage1.model;


public class Movie {

    private int mId;
    private String mTitle;
    private String mMoviePoster;
    private String mPlot;
    private String mRating;
    private String mReleaseDate;
    private String backdropPoster;

    public String getBackdropPoster() {
        return backdropPoster;
    }

    public void setBackdropPoster(String backdropPoster) {
        this.backdropPoster = backdropPoster;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmMoviePoster() {
        return mMoviePoster;
    }

    public void setmMoviePoster(String mMoviePoster) {
        this.mMoviePoster = mMoviePoster;
    }

    public String getmPlot() {
        return mPlot;
    }

    public void setmPlot(String mPlot) {
        this.mPlot = mPlot;
    }

    public String getmRating() {
        return mRating;
    }

    public void setmRating(String mRating) {
        this.mRating = mRating;
    }

    public String getmReleaseDate() {
        return mReleaseDate;
    }

    public void setmReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
    }
}
