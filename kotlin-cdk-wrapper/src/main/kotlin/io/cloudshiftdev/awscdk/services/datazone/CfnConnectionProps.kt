@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnConnectionProps cfnConnectionProps = CfnConnectionProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .environmentIdentifier("environmentIdentifier")
 * .name("name")
 * // the properties below are optional
 * .awsLocation(AwsLocationProperty.builder()
 * .accessRole("accessRole")
 * .awsAccountId("awsAccountId")
 * .awsRegion("awsRegion")
 * .iamConnectionId("iamConnectionId")
 * .build())
 * .description("description")
 * .props(ConnectionPropertiesInputProperty.builder()
 * .athenaProperties(AthenaPropertiesInputProperty.builder()
 * .workgroupName("workgroupName")
 * .build())
 * .glueProperties(GluePropertiesInputProperty.builder()
 * .glueConnectionInput(GlueConnectionInputProperty.builder()
 * .athenaProperties(Map.of(
 * "athenaPropertiesKey", "athenaProperties"))
 * .authenticationConfiguration(AuthenticationConfigurationInputProperty.builder()
 * .authenticationType("authenticationType")
 * .basicAuthenticationCredentials(BasicAuthenticationCredentialsProperty.builder()
 * .password("password")
 * .userName("userName")
 * .build())
 * .customAuthenticationCredentials(Map.of(
 * "customAuthenticationCredentialsKey", "customAuthenticationCredentials"))
 * .kmsKeyArn("kmsKeyArn")
 * .oAuth2Properties(OAuth2PropertiesProperty.builder()
 * .authorizationCodeProperties(AuthorizationCodePropertiesProperty.builder()
 * .authorizationCode("authorizationCode")
 * .redirectUri("redirectUri")
 * .build())
 * .oAuth2ClientApplication(OAuth2ClientApplicationProperty.builder()
 * .awsManagedClientApplicationReference("awsManagedClientApplicationReference")
 * .userManagedClientApplicationClientId("userManagedClientApplicationClientId")
 * .build())
 * .oAuth2Credentials(GlueOAuth2CredentialsProperty.builder()
 * .accessToken("accessToken")
 * .jwtToken("jwtToken")
 * .refreshToken("refreshToken")
 * .userManagedClientApplicationClientSecret("userManagedClientApplicationClientSecret")
 * .build())
 * .oAuth2GrantType("oAuth2GrantType")
 * .tokenUrl("tokenUrl")
 * .tokenUrlParametersMap(Map.of(
 * "tokenUrlParametersMapKey", "tokenUrlParametersMap"))
 * .build())
 * .secretArn("secretArn")
 * .build())
 * .connectionProperties(Map.of(
 * "connectionPropertiesKey", "connectionProperties"))
 * .connectionType("connectionType")
 * .description("description")
 * .matchCriteria("matchCriteria")
 * .name("name")
 * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
 * .availabilityZone("availabilityZone")
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetId("subnetId")
 * .subnetIdList(List.of("subnetIdList"))
 * .build())
 * .pythonProperties(Map.of(
 * "pythonPropertiesKey", "pythonProperties"))
 * .sparkProperties(Map.of(
 * "sparkPropertiesKey", "sparkProperties"))
 * .validateCredentials(false)
 * .validateForComputeEnvironments(List.of("validateForComputeEnvironments"))
 * .build())
 * .build())
 * .hyperPodProperties(HyperPodPropertiesInputProperty.builder()
 * .clusterName("clusterName")
 * .build())
 * .iamProperties(IamPropertiesInputProperty.builder()
 * .glueLineageSyncEnabled(false)
 * .build())
 * .redshiftProperties(RedshiftPropertiesInputProperty.builder()
 * .credentials(RedshiftCredentialsProperty.builder()
 * .secretArn("secretArn")
 * .usernamePassword(UsernamePasswordProperty.builder()
 * .password("password")
 * .username("username")
 * .build())
 * .build())
 * .databaseName("databaseName")
 * .host("host")
 * .lineageSync(RedshiftLineageSyncConfigurationInputProperty.builder()
 * .enabled(false)
 * .schedule(LineageSyncScheduleProperty.builder()
 * .schedule("schedule")
 * .build())
 * .build())
 * .port(123)
 * .storage(RedshiftStoragePropertiesProperty.builder()
 * .clusterName("clusterName")
 * .workgroupName("workgroupName")
 * .build())
 * .build())
 * .sparkEmrProperties(SparkEmrPropertiesInputProperty.builder()
 * .computeArn("computeArn")
 * .instanceProfileArn("instanceProfileArn")
 * .javaVirtualEnv("javaVirtualEnv")
 * .logUri("logUri")
 * .pythonVirtualEnv("pythonVirtualEnv")
 * .runtimeRole("runtimeRole")
 * .trustedCertificatesS3Uri("trustedCertificatesS3Uri")
 * .build())
 * .sparkGlueProperties(SparkGluePropertiesInputProperty.builder()
 * .additionalArgs(SparkGlueArgsProperty.builder()
 * .connection("connection")
 * .build())
 * .glueConnectionName("glueConnectionName")
 * .glueVersion("glueVersion")
 * .idleTimeout(123)
 * .javaVirtualEnv("javaVirtualEnv")
 * .numberOfWorkers(123)
 * .pythonVirtualEnv("pythonVirtualEnv")
 * .workerType("workerType")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html)
 */
public interface CfnConnectionProps {
  /**
   * The location where the connection is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-awslocation)
   */
  public fun awsLocation(): Any? = unwrap(this).getAwsLocation()

  /**
   * Connection description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the domain where the connection is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The ID of the environment where the connection is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-environmentidentifier)
   */
  public fun environmentIdentifier(): String

  /**
   * The name of the connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-name)
   */
  public fun name(): String

  /**
   * Connection props.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-props)
   */
  public fun props(): Any? = unwrap(this).getProps()

  /**
   * A builder for [CfnConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param awsLocation The location where the connection is created.
     */
    public fun awsLocation(awsLocation: IResolvable)

    /**
     * @param awsLocation The location where the connection is created.
     */
    public fun awsLocation(awsLocation: CfnConnection.AwsLocationProperty)

    /**
     * @param awsLocation The location where the connection is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdeaad0ecda33daf9dad20951d1adc3e79d44d34d03c91185a33f7bd8bc8ae3a")
    public fun awsLocation(awsLocation: CfnConnection.AwsLocationProperty.Builder.() -> Unit)

    /**
     * @param description Connection description.
     */
    public fun description(description: String)

    /**
     * @param domainIdentifier The ID of the domain where the connection is created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param environmentIdentifier The ID of the environment where the connection is created. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * @param name The name of the connection. 
     */
    public fun name(name: String)

    /**
     * @param props Connection props.
     */
    public fun props(props: IResolvable)

    /**
     * @param props Connection props.
     */
    public fun props(props: CfnConnection.ConnectionPropertiesInputProperty)

    /**
     * @param props Connection props.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("168149fa3200f3faa442e8156c895b58b84bd026c56cfdb1df90b72921c1a360")
    public fun props(props: CfnConnection.ConnectionPropertiesInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnConnectionProps.Builder =
        software.amazon.awscdk.services.datazone.CfnConnectionProps.builder()

    /**
     * @param awsLocation The location where the connection is created.
     */
    override fun awsLocation(awsLocation: IResolvable) {
      cdkBuilder.awsLocation(awsLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param awsLocation The location where the connection is created.
     */
    override fun awsLocation(awsLocation: CfnConnection.AwsLocationProperty) {
      cdkBuilder.awsLocation(awsLocation.let(CfnConnection.AwsLocationProperty.Companion::unwrap))
    }

    /**
     * @param awsLocation The location where the connection is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdeaad0ecda33daf9dad20951d1adc3e79d44d34d03c91185a33f7bd8bc8ae3a")
    override fun awsLocation(awsLocation: CfnConnection.AwsLocationProperty.Builder.() -> Unit):
        Unit = awsLocation(CfnConnection.AwsLocationProperty(awsLocation))

    /**
     * @param description Connection description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param domainIdentifier The ID of the domain where the connection is created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param environmentIdentifier The ID of the environment where the connection is created. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * @param name The name of the connection. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param props Connection props.
     */
    override fun props(props: IResolvable) {
      cdkBuilder.props(props.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param props Connection props.
     */
    override fun props(props: CfnConnection.ConnectionPropertiesInputProperty) {
      cdkBuilder.props(props.let(CfnConnection.ConnectionPropertiesInputProperty.Companion::unwrap))
    }

    /**
     * @param props Connection props.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("168149fa3200f3faa442e8156c895b58b84bd026c56cfdb1df90b72921c1a360")
    override fun props(props: CfnConnection.ConnectionPropertiesInputProperty.Builder.() -> Unit):
        Unit = props(CfnConnection.ConnectionPropertiesInputProperty(props))

    public fun build(): software.amazon.awscdk.services.datazone.CfnConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnConnectionProps,
  ) : CdkObject(cdkObject),
      CfnConnectionProps {
    /**
     * The location where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-awslocation)
     */
    override fun awsLocation(): Any? = unwrap(this).getAwsLocation()

    /**
     * Connection description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the domain where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The ID of the environment where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-environmentidentifier)
     */
    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    /**
     * The name of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Connection props.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-props)
     */
    override fun props(): Any? = unwrap(this).getProps()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnectionProps):
        CfnConnectionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionProps):
        software.amazon.awscdk.services.datazone.CfnConnectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnConnectionProps
  }
}
