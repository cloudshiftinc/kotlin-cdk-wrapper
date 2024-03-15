@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface AmazonLinuxImageSsmParameterCommonOptions : AmazonLinuxImageSsmParameterBaseOptions
    {
  public fun cpuType(): AmazonLinuxCpuType? =
      unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

  public fun edition(): AmazonLinuxEdition? =
      unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun cpuType(cpuType: AmazonLinuxCpuType)

    public fun edition(edition: AmazonLinuxEdition)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions.Builder =
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions.builder()

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun cpuType(cpuType: AmazonLinuxCpuType) {
      cdkBuilder.cpuType(cpuType.let(AmazonLinuxCpuType::unwrap))
    }

    override fun edition(edition: AmazonLinuxEdition) {
      cdkBuilder.edition(edition.let(AmazonLinuxEdition::unwrap))
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions,
  ) : CdkObject(cdkObject), AmazonLinuxImageSsmParameterCommonOptions {
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    override fun cpuType(): AmazonLinuxCpuType? =
        unwrap(this).getCpuType()?.let(AmazonLinuxCpuType::wrap)

    override fun edition(): AmazonLinuxEdition? =
        unwrap(this).getEdition()?.let(AmazonLinuxEdition::wrap)

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AmazonLinuxImageSsmParameterCommonOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions):
        AmazonLinuxImageSsmParameterCommonOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AmazonLinuxImageSsmParameterCommonOptions):
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterCommonOptions
  }
}
