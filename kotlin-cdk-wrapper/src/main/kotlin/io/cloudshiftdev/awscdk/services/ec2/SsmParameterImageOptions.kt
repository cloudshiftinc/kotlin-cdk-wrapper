@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SsmParameterImageOptions {
  public fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

  public fun os(): OperatingSystemType? = unwrap(this).getOs()?.let(OperatingSystemType::wrap)

  public fun parameterVersion(): String? = unwrap(this).getParameterVersion()

  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cachedInContext(cachedInContext: Boolean)

    public fun os(os: OperatingSystemType)

    public fun parameterVersion(parameterVersion: String)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SsmParameterImageOptions.Builder =
        software.amazon.awscdk.services.ec2.SsmParameterImageOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.ec2.SsmParameterImageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SsmParameterImageOptions,
  ) : CdkObject(cdkObject), SsmParameterImageOptions {
    override fun cachedInContext(): Boolean? = unwrap(this).getCachedInContext()

    override fun os(): OperatingSystemType? = unwrap(this).getOs()?.let(OperatingSystemType::wrap)

    override fun parameterVersion(): String? = unwrap(this).getParameterVersion()

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SsmParameterImageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SsmParameterImageOptions):
        SsmParameterImageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SsmParameterImageOptions):
        software.amazon.awscdk.services.ec2.SsmParameterImageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SsmParameterImageOptions
  }
}
