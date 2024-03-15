@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnSecurityConfigurationProps {
  public fun name(): String? = unwrap(this).getName()

  public fun securityConfiguration(): Any

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun securityConfiguration(securityConfiguration: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder =
        software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun securityConfiguration(securityConfiguration: Any) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps,
  ) : CdkObject(cdkObject), CfnSecurityConfigurationProps {
    override fun name(): String? = unwrap(this).getName()

    override fun securityConfiguration(): Any = unwrap(this).getSecurityConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps):
        CfnSecurityConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfigurationProps):
        software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps
  }
}
