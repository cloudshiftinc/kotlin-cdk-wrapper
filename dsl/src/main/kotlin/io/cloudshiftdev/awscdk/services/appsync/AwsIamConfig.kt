package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface AwsIamConfig {
  public fun signingRegion(): String

  public fun signingServiceName(): String

  public interface Builder {
    public fun signingRegion(signingRegion: String) {
    }

    public fun signingServiceName(signingServiceName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AwsIamConfig.Builder =
        software.amazon.awscdk.services.appsync.AwsIamConfig.builder()

    public override fun signingRegion(signingRegion: String) {
      cdkBuilder.signingRegion(signingRegion)
    }

    public override fun signingServiceName(signingServiceName: String) {
      cdkBuilder.signingServiceName(signingServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AwsIamConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.AwsIamConfig,
  ) : AwsIamConfig {
    public override fun signingRegion(): String = unwrap(this).getSigningRegion()

    public override fun signingServiceName(): String = unwrap(this).getSigningServiceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIamConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AwsIamConfig): AwsIamConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsIamConfig): software.amazon.awscdk.services.appsync.AwsIamConfig
        = (wrapped as Wrapper).cdkObject
  }
}
