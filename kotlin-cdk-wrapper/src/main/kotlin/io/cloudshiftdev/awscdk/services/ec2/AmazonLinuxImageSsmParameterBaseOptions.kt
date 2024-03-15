@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface AmazonLinuxImageSsmParameterBaseOptions {
  public fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions.builder()

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions,
  ) : CdkObject(cdkObject), AmazonLinuxImageSsmParameterBaseOptions {
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AmazonLinuxImageSsmParameterBaseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions):
        AmazonLinuxImageSsmParameterBaseOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImageSsmParameterBaseOptions):
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions
  }
}
