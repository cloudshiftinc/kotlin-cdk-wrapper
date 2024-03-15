@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface AwsIamConfig {
  public fun signingRegion(): String

  public fun signingServiceName(): String

  @CdkDslMarker
  public interface Builder {
    public fun signingRegion(signingRegion: String)

    public fun signingServiceName(signingServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AwsIamConfig.Builder =
        software.amazon.awscdk.services.appsync.AwsIamConfig.builder()

    override fun signingRegion(signingRegion: String) {
      cdkBuilder.signingRegion(signingRegion)
    }

    override fun signingServiceName(signingServiceName: String) {
      cdkBuilder.signingServiceName(signingServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AwsIamConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.AwsIamConfig,
  ) : CdkObject(cdkObject), AwsIamConfig {
    override fun signingRegion(): String = unwrap(this).getSigningRegion()

    override fun signingServiceName(): String = unwrap(this).getSigningServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsIamConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AwsIamConfig): AwsIamConfig
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsIamConfig): software.amazon.awscdk.services.appsync.AwsIamConfig
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AwsIamConfig
  }
}
