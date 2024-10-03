@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * Use a `SecurityConfiguration` resource to configure data encryption, Kerberos authentication
 * (available in Amazon EMR release version 5.10.0 and later), and Amazon S3 authorization for EMRFS
 * (available in EMR 5.10.0 and later). You can re-use a security configuration for any number of
 * clusters in your account. For more information and example security configuration JSON objects, see
 * [Create a Security
 * Configuration](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-create-security-configuration.html)
 * in the *Amazon EMR Management Guide* .
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.emr.*;
 * CfnSecurityConfiguration cfnSecurityConfiguration = CfnSecurityConfiguration.Builder.create(this,
 * "EmrSecurityConfiguration")
 * .name("AddStepRuntimeRoleSecConfig")
 * .securityConfiguration(JSON.parse("\n    {\n      \"AuthorizationConfiguration\": {\n         
 * \"IAMConfiguration\": {\n              \"EnableApplicationScopedIAMRole\": true,\n             
 * \"ApplicationScopedIAMRoleConfiguration\":\n                  {\n                     
 * \"PropagateSourceIdentity\": true\n                  }\n          },\n         
 * \"LakeFormationConfiguration\": {\n              \"AuthorizedSessionTagValue\": \"Amazon EMR\"\n    
 *      }\n      }\n    }"))
 * .build();
 * EmrCreateCluster task = EmrCreateCluster.Builder.create(this, "Create Cluster")
 * .instances(InstancesConfigProperty.builder().build())
 * .name(TaskInput.fromJsonPathAt("$.ClusterName").getValue())
 * .securityConfiguration(cfnSecurityConfiguration.getName())
 * .build();
 * Role executionRole = Role.Builder.create(this, "Role")
 * .assumedBy(new ArnPrincipal(task.getClusterRole().getRoleArn()))
 * .build();
 * executionRole.assumeRolePolicy.addStatements(
 * PolicyStatement.Builder.create()
 * .effect(Effect.ALLOW)
 * .principals(List.of(task.getClusterRole()))
 * .actions(List.of("sts:SetSourceIdentity"))
 * .build(),
 * PolicyStatement.Builder.create()
 * .effect(Effect.ALLOW)
 * .principals(List.of(task.getClusterRole()))
 * .actions(List.of("sts:TagSession"))
 * .conditions(Map.of(
 * "StringEquals", Map.of(
 * "aws:RequestTag/LakeFormationAuthorizedCaller", "Amazon EMR")))
 * .build());
 * EmrAddStep.Builder.create(this, "Task")
 * .clusterId("ClusterId")
 * .executionRoleArn(executionRole.getRoleArn())
 * .name("StepName")
 * .jar("Jar")
 * .actionOnFailure(ActionOnFailure.CONTINUE)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
 */
public open class CfnSecurityConfiguration(
  cdkObject: software.amazon.awscdk.services.emr.CfnSecurityConfiguration,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.emr.CfnSecurityConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSecurityConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityConfigurationProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
     * For JSON parameters and examples, see [Use Security Configurations to Set Up Cluster
     * Security](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html)
     * in the *Amazon EMR Management Guide* .
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
     * For JSON parameters and examples, see [Use Security Configurations to Set Up Cluster
     * Security](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html)
     * in the *Amazon EMR Management Guide* .
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
        software.amazon.awscdk.services.emr.CfnSecurityConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.emr.CfnSecurityConfiguration
  }
}
