package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnSecurityConfigurationProps {
  /**
   * The name of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The security configuration details in JSON format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
   */
  public fun securityConfiguration(): Any

  /**
   * A builder for [CfnSecurityConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the security configuration.
     */
    public fun name(name: String)

    /**
     * @param securityConfiguration The security configuration details in JSON format. 
     */
    public fun securityConfiguration(securityConfiguration: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.Builder =
        software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps.builder()

    /**
     * @param name The name of the security configuration.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param securityConfiguration The security configuration details in JSON format. 
     */
    override fun securityConfiguration(securityConfiguration: Any) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps,
  ) : CdkObject(cdkObject), CfnSecurityConfigurationProps {
    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The security configuration details in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
     */
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
