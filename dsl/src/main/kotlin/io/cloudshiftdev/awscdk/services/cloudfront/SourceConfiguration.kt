package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface SourceConfiguration {
  public fun behaviors(): List<Behavior>

  public fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

  public fun connectionTimeout(): Duration? =
      unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

  public fun customOriginSource(): CustomOriginConfig? =
      unwrap(this).getCustomOriginSource()?.let(CustomOriginConfig::wrap)

  public fun failoverCriteriaStatusCodes(): List<FailoverStatusCode> =
      unwrap(this).getFailoverCriteriaStatusCodes()?.map(FailoverStatusCode::wrap) ?: emptyList()

  public fun failoverCustomOriginSource(): CustomOriginConfig? =
      unwrap(this).getFailoverCustomOriginSource()?.let(CustomOriginConfig::wrap)

  public fun failoverS3OriginSource(): S3OriginConfig? =
      unwrap(this).getFailoverS3OriginSource()?.let(S3OriginConfig::wrap)

  public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

  public fun s3OriginSource(): S3OriginConfig? =
      unwrap(this).getS3OriginSource()?.let(S3OriginConfig::wrap)

  public interface Builder {
    public fun behaviors(behaviors: List<Behavior>) {
    }

    public fun connectionAttempts(connectionAttempts: Number) {
    }

    public fun connectionTimeout(connectionTimeout: Duration) {
    }

    public fun customOriginSource(customOriginSource: CustomOriginConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1f40b3266f2ceec05cf9721afd6a3bf58299f6119273d45fb2c6546a8d08660")
    public fun customOriginSource(customOriginSource: CustomOriginConfig.Builder.() -> Unit) {
    }

    public fun failoverCriteriaStatusCodes(failoverCriteriaStatusCodes: List<FailoverStatusCode>) {
    }

    public fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa7f5a63e9eda405094c837ab71bbd677005861785044a491dea3de9bcce8df")
    public
        fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig.Builder.() -> Unit) {
    }

    public fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce12ffa0dc18dbba552bd55cbecb5faa871b2ddd6add2071f13850d513cbcee9")
    public fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig.Builder.() -> Unit) {
    }

    public fun originShieldRegion(originShieldRegion: String) {
    }

    public fun s3OriginSource(s3OriginSource: S3OriginConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6ed34543781537ee9dc47cec4ee592e4032c4b954e6e802eef6b3a299c6ddbf")
    public fun s3OriginSource(s3OriginSource: S3OriginConfig.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder =
        software.amazon.awscdk.services.cloudfront.SourceConfiguration.builder()

    public override fun behaviors(behaviors: List<Behavior>) {
      cdkBuilder.behaviors(behaviors.map(Behavior::unwrap))
    }

    public override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    public override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
    }

    public override fun customOriginSource(customOriginSource: CustomOriginConfig) {
      cdkBuilder.customOriginSource(customOriginSource.let(CustomOriginConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1f40b3266f2ceec05cf9721afd6a3bf58299f6119273d45fb2c6546a8d08660")
    public override
        fun customOriginSource(customOriginSource: CustomOriginConfig.Builder.() -> Unit): Unit =
        customOriginSource(CustomOriginConfig(customOriginSource))

    public override
        fun failoverCriteriaStatusCodes(failoverCriteriaStatusCodes: List<FailoverStatusCode>) {
      cdkBuilder.failoverCriteriaStatusCodes(failoverCriteriaStatusCodes.map(FailoverStatusCode::unwrap))
    }

    public override fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig) {
      cdkBuilder.failoverCustomOriginSource(failoverCustomOriginSource.let(CustomOriginConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa7f5a63e9eda405094c837ab71bbd677005861785044a491dea3de9bcce8df")
    public override
        fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig.Builder.() -> Unit):
        Unit = failoverCustomOriginSource(CustomOriginConfig(failoverCustomOriginSource))

    public override fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig) {
      cdkBuilder.failoverS3OriginSource(failoverS3OriginSource.let(S3OriginConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce12ffa0dc18dbba552bd55cbecb5faa871b2ddd6add2071f13850d513cbcee9")
    public override
        fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig.Builder.() -> Unit): Unit
        = failoverS3OriginSource(S3OriginConfig(failoverS3OriginSource))

    public override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public override fun s3OriginSource(s3OriginSource: S3OriginConfig) {
      cdkBuilder.s3OriginSource(s3OriginSource.let(S3OriginConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6ed34543781537ee9dc47cec4ee592e4032c4b954e6e802eef6b3a299c6ddbf")
    public override fun s3OriginSource(s3OriginSource: S3OriginConfig.Builder.() -> Unit): Unit =
        s3OriginSource(S3OriginConfig(s3OriginSource))

    public fun build(): software.amazon.awscdk.services.cloudfront.SourceConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.SourceConfiguration,
  ) : SourceConfiguration {
    public override fun behaviors(): List<Behavior> =
        unwrap(this).getBehaviors().map(Behavior::wrap)

    public override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    public override fun connectionTimeout(): Duration? =
        unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

    public override fun customOriginSource(): CustomOriginConfig? =
        unwrap(this).getCustomOriginSource()?.let(CustomOriginConfig::wrap)

    public override fun failoverCriteriaStatusCodes(): List<FailoverStatusCode> =
        unwrap(this).getFailoverCriteriaStatusCodes()?.map(FailoverStatusCode::wrap) ?: emptyList()

    public override fun failoverCustomOriginSource(): CustomOriginConfig? =
        unwrap(this).getFailoverCustomOriginSource()?.let(CustomOriginConfig::wrap)

    public override fun failoverS3OriginSource(): S3OriginConfig? =
        unwrap(this).getFailoverS3OriginSource()?.let(S3OriginConfig::wrap)

    public override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

    public override fun s3OriginSource(): S3OriginConfig? =
        unwrap(this).getS3OriginSource()?.let(S3OriginConfig::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.SourceConfiguration):
        SourceConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceConfiguration):
        software.amazon.awscdk.services.cloudfront.SourceConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
