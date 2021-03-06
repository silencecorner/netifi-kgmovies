// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kgmovies.service.movie/movie-service.proto

package kgmovies.service.movie.protobuf;

public interface MovieInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kgmovies.service.movie.MovieInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string movieId = 1;</code>
   */
  java.lang.String getMovieId();
  /**
   * <code>string movieId = 1;</code>
   */
  com.google.protobuf.ByteString
      getMovieIdBytes();

  /**
   * <code>string shortName = 2;</code>
   */
  java.lang.String getShortName();
  /**
   * <code>string shortName = 2;</code>
   */
  com.google.protobuf.ByteString
      getShortNameBytes();

  /**
   * <code>string longName = 3;</code>
   */
  java.lang.String getLongName();
  /**
   * <code>string longName = 3;</code>
   */
  com.google.protobuf.ByteString
      getLongNameBytes();

  /**
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>bool active = 5;</code>
   */
  boolean getActive();

  /**
   * <code>repeated .kgmovies.service.movie.SkuInfo skus = 6;</code>
   */
  java.util.List<kgmovies.service.movie.protobuf.SkuInfo> 
      getSkusList();
  /**
   * <code>repeated .kgmovies.service.movie.SkuInfo skus = 6;</code>
   */
  kgmovies.service.movie.protobuf.SkuInfo getSkus(int index);
  /**
   * <code>repeated .kgmovies.service.movie.SkuInfo skus = 6;</code>
   */
  int getSkusCount();
  /**
   * <code>repeated .kgmovies.service.movie.SkuInfo skus = 6;</code>
   */
  java.util.List<? extends kgmovies.service.movie.protobuf.SkuInfoOrBuilder> 
      getSkusOrBuilderList();
  /**
   * <code>repeated .kgmovies.service.movie.SkuInfo skus = 6;</code>
   */
  kgmovies.service.movie.protobuf.SkuInfoOrBuilder getSkusOrBuilder(
      int index);
}
