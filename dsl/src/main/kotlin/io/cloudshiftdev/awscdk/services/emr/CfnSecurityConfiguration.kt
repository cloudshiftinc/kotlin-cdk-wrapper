package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emr.CfnSecurityConfiguration,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the security configuration.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the security configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The security configuration details in JSON format.
   */
  public open fun securityConfiguration(): Any = unwrap(this).getSecurityConfiguration()

  /**
   * The security configuration details in JSON format.
   */
  public open fun securityConfiguration(`value`: Any) {
    unwrap(this).setSecurityConfiguration(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.emr.CfnSecurityConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
     * @param name The name of the security configuration. 
     */
    public fun name(name: String)

    /**
     * The security configuration details in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
     * @param securityConfiguration The security configuration details in JSON format. 
     */
    public fun securityConfiguration(securityConfiguration: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnSecurityConfiguration.Builder =
        software.amazon.awscdk.services.emr.CfnSecurityConfiguration.Builder.create(scope, id)

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
     * @param name The name of the security configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The security configuration details in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
     * @param securityConfiguration The security configuration details in JSON format. 
     */
    override fun securityConfiguration(securityConfiguration: Any) {
      cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnSecurityConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emr.CfnSecurityConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnSecurityConfiguration):
        CfnSecurityConfiguration = CfnSecurityConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfiguration):
        software.amazon.awscdk.services.emr.CfnSecurityConfiguration = wrapped.cdkObject
  }
}
