@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface AmazonLinuxImageSsmParameterBaseProps : AmazonLinuxImageSsmParameterBaseOptions {
  public fun parameterName(): String

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun parameterName(parameterName: String)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps.builder()

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps,
  ) : CdkObject(cdkObject), AmazonLinuxImageSsmParameterBaseProps {
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    override fun parameterName(): String = unwrap(this).getParameterName()

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AmazonLinuxImageSsmParameterBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps):
        AmazonLinuxImageSsmParameterBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImageSsmParameterBaseProps):
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps
  }
}
