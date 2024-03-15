@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class ResolveSsmParameterAtLaunchImage internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage,
) : CdkObject(cdkObject), IMachineImage {
  public override fun image(`__`: Construct): MachineImageConfig =
      unwrap(this).getImage(`__`.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  public open fun parameterName(): String = unwrap(this).getParameterName()

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun os(os: OperatingSystemType)

    public fun parameterVersion(parameterVersion: String)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl(
    parameterName: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage.Builder =
        software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage.Builder.create(parameterName)

    override fun cachedInContext(cachedInContext: Boolean) {
      cdkBuilder.cachedInContext(cachedInContext)
    }

    override fun os(os: OperatingSystemType) {
      cdkBuilder.os(os.let(OperatingSystemType::unwrap))
    }

    override fun parameterVersion(parameterVersion: String) {
      cdkBuilder.parameterVersion(parameterVersion)
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(parameterName: String, block: Builder.() -> Unit = {}):
        ResolveSsmParameterAtLaunchImage {
      val builderImpl = BuilderImpl(parameterName)
      return ResolveSsmParameterAtLaunchImage(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage):
        ResolveSsmParameterAtLaunchImage = ResolveSsmParameterAtLaunchImage(cdkObject)

    internal fun unwrap(wrapped: ResolveSsmParameterAtLaunchImage):
        software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage = wrapped.cdkObject
  }
}
