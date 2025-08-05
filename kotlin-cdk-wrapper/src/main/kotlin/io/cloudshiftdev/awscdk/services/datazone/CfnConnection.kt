@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * In Amazon DataZone, a connection enables you to connect your resources (domains, projects, and
 * environments) to external resources and services.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
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
public open class CfnConnection(
  cdkObject: software.amazon.awscdk.services.datazone.CfnConnection,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnConnection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectionProps(props)
  )

  /**
   * The ID of the connection.
   */
  public open fun attrConnectionId(): String = unwrap(this).getAttrConnectionId()

  /**
   * The domain ID of the connection.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The domain unit ID of the connection.
   */
  public open fun attrDomainUnitId(): String = unwrap(this).getAttrDomainUnitId()

  /**
   * The ID of the environment.
   */
  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  /**
   * The environment user role.
   */
  public open fun attrEnvironmentUserRole(): String = unwrap(this).getAttrEnvironmentUserRole()

  /**
   * The ID of the project.
   */
  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  /**
   * The type of the connection.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The location where the connection is created.
   */
  public open fun awsLocation(): Any? = unwrap(this).getAwsLocation()

  /**
   * The location where the connection is created.
   */
  public open fun awsLocation(`value`: IResolvable) {
    unwrap(this).setAwsLocation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The location where the connection is created.
   */
  public open fun awsLocation(`value`: AwsLocationProperty) {
    unwrap(this).setAwsLocation(`value`.let(AwsLocationProperty.Companion::unwrap))
  }

  /**
   * The location where the connection is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8dd065da7e41a8ac14491d9afc6e690b706d58acdca9f64e6db7b6a813cccac8")
  public open fun awsLocation(`value`: AwsLocationProperty.Builder.() -> Unit): Unit =
      awsLocation(AwsLocationProperty(`value`))

  /**
   * Connection description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Connection description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The ID of the domain where the connection is created.
   */
  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  /**
   * The ID of the domain where the connection is created.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The ID of the environment where the connection is created.
   */
  public open fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

  /**
   * The ID of the environment where the connection is created.
   */
  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the connection.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the connection.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Connection props.
   */
  public open fun props(): Any? = unwrap(this).getProps()

  /**
   * Connection props.
   */
  public open fun props(`value`: IResolvable) {
    unwrap(this).setProps(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Connection props.
   */
  public open fun props(`value`: ConnectionPropertiesInputProperty) {
    unwrap(this).setProps(`value`.let(ConnectionPropertiesInputProperty.Companion::unwrap))
  }

  /**
   * Connection props.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("197dcd93ccccca1e5dfae0ed5c1e8d3b1f6cadbeb03af846c928b1c9869137a3")
  public open fun props(`value`: ConnectionPropertiesInputProperty.Builder.() -> Unit): Unit =
      props(ConnectionPropertiesInputProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The location where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-awslocation)
     * @param awsLocation The location where the connection is created. 
     */
    public fun awsLocation(awsLocation: IResolvable)

    /**
     * The location where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-awslocation)
     * @param awsLocation The location where the connection is created. 
     */
    public fun awsLocation(awsLocation: AwsLocationProperty)

    /**
     * The location where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-awslocation)
     * @param awsLocation The location where the connection is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2c3d8348924f7af64485ff0ed101e0c97a45c6dc7357b71ec6d2a374b856d7")
    public fun awsLocation(awsLocation: AwsLocationProperty.Builder.() -> Unit)

    /**
     * Connection description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-description)
     * @param description Connection description. 
     */
    public fun description(description: String)

    /**
     * The ID of the domain where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-domainidentifier)
     * @param domainIdentifier The ID of the domain where the connection is created. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The ID of the environment where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-environmentidentifier)
     * @param environmentIdentifier The ID of the environment where the connection is created. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * The name of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-name)
     * @param name The name of the connection. 
     */
    public fun name(name: String)

    /**
     * Connection props.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-props)
     * @param props Connection props. 
     */
    public fun props(props: IResolvable)

    /**
     * Connection props.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-props)
     * @param props Connection props. 
     */
    public fun props(props: ConnectionPropertiesInputProperty)

    /**
     * Connection props.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-props)
     * @param props Connection props. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a33bb8bee36734b6c975fe418152da508f34f93be279db4677eca65d3217253")
    public fun props(props: ConnectionPropertiesInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnConnection.Builder =
        software.amazon.awscdk.services.datazone.CfnConnection.Builder.create(scope, id)

    /**
     * The location where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-awslocation)
     * @param awsLocation The location where the connection is created. 
     */
    override fun awsLocation(awsLocation: IResolvable) {
      cdkBuilder.awsLocation(awsLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * The location where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-awslocation)
     * @param awsLocation The location where the connection is created. 
     */
    override fun awsLocation(awsLocation: AwsLocationProperty) {
      cdkBuilder.awsLocation(awsLocation.let(AwsLocationProperty.Companion::unwrap))
    }

    /**
     * The location where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-awslocation)
     * @param awsLocation The location where the connection is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2c3d8348924f7af64485ff0ed101e0c97a45c6dc7357b71ec6d2a374b856d7")
    override fun awsLocation(awsLocation: AwsLocationProperty.Builder.() -> Unit): Unit =
        awsLocation(AwsLocationProperty(awsLocation))

    /**
     * Connection description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-description)
     * @param description Connection description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The ID of the domain where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-domainidentifier)
     * @param domainIdentifier The ID of the domain where the connection is created. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The ID of the environment where the connection is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-environmentidentifier)
     * @param environmentIdentifier The ID of the environment where the connection is created. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * The name of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-name)
     * @param name The name of the connection. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Connection props.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-props)
     * @param props Connection props. 
     */
    override fun props(props: IResolvable) {
      cdkBuilder.props(props.let(IResolvable.Companion::unwrap))
    }

    /**
     * Connection props.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-props)
     * @param props Connection props. 
     */
    override fun props(props: ConnectionPropertiesInputProperty) {
      cdkBuilder.props(props.let(ConnectionPropertiesInputProperty.Companion::unwrap))
    }

    /**
     * Connection props.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-connection.html#cfn-datazone-connection-props)
     * @param props Connection props. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a33bb8bee36734b6c975fe418152da508f34f93be279db4677eca65d3217253")
    override fun props(props: ConnectionPropertiesInputProperty.Builder.() -> Unit): Unit =
        props(ConnectionPropertiesInputProperty(props))

    public fun build(): software.amazon.awscdk.services.datazone.CfnConnection = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection):
        CfnConnection = CfnConnection(cdkObject)

    internal fun unwrap(wrapped: CfnConnection):
        software.amazon.awscdk.services.datazone.CfnConnection = wrapped.cdkObject as
        software.amazon.awscdk.services.datazone.CfnConnection
  }

  /**
   * The Amazon Athena properties of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * AthenaPropertiesInputProperty athenaPropertiesInputProperty =
   * AthenaPropertiesInputProperty.builder()
   * .workgroupName("workgroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-athenapropertiesinput.html)
   */
  public interface AthenaPropertiesInputProperty {
    /**
     * The Amazon Athena workgroup name of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-athenapropertiesinput.html#cfn-datazone-connection-athenapropertiesinput-workgroupname)
     */
    public fun workgroupName(): String

    /**
     * A builder for [AthenaPropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param workgroupName The Amazon Athena workgroup name of a connection. 
       */
      public fun workgroupName(workgroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.AthenaPropertiesInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.AthenaPropertiesInputProperty.builder()

      /**
       * @param workgroupName The Amazon Athena workgroup name of a connection. 
       */
      override fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.AthenaPropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.AthenaPropertiesInputProperty,
    ) : CdkObject(cdkObject),
        AthenaPropertiesInputProperty {
      /**
       * The Amazon Athena workgroup name of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-athenapropertiesinput.html#cfn-datazone-connection-athenapropertiesinput-workgroupname)
       */
      override fun workgroupName(): String = unwrap(this).getWorkgroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AthenaPropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.AthenaPropertiesInputProperty):
          AthenaPropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AthenaPropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AthenaPropertiesInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.AthenaPropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.AthenaPropertiesInputProperty
    }
  }

  /**
   * The authentication configuration of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * AuthenticationConfigurationInputProperty authenticationConfigurationInputProperty =
   * AuthenticationConfigurationInputProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html)
   */
  public interface AuthenticationConfigurationInputProperty {
    /**
     * The authentication type of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-authenticationtype)
     */
    public fun authenticationType(): String? = unwrap(this).getAuthenticationType()

    /**
     * The basic authentication credentials of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-basicauthenticationcredentials)
     */
    public fun basicAuthenticationCredentials(): Any? =
        unwrap(this).getBasicAuthenticationCredentials()

    /**
     * The custom authentication credentials of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-customauthenticationcredentials)
     */
    public fun customAuthenticationCredentials(): Any? =
        unwrap(this).getCustomAuthenticationCredentials()

    /**
     * The KMS key ARN of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The oAuth2 properties of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-oauth2properties)
     */
    public fun oAuth2Properties(): Any? = unwrap(this).getOAuth2Properties()

    /**
     * The secret ARN of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * A builder for [AuthenticationConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authenticationType The authentication type of a connection.
       */
      public fun authenticationType(authenticationType: String)

      /**
       * @param basicAuthenticationCredentials The basic authentication credentials of a connection.
       */
      public fun basicAuthenticationCredentials(basicAuthenticationCredentials: IResolvable)

      /**
       * @param basicAuthenticationCredentials The basic authentication credentials of a connection.
       */
      public
          fun basicAuthenticationCredentials(basicAuthenticationCredentials: BasicAuthenticationCredentialsProperty)

      /**
       * @param basicAuthenticationCredentials The basic authentication credentials of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ffd2572d52e39b8741803721b27ce89fddb5d7843e26c21f4b5468a34c34499")
      public
          fun basicAuthenticationCredentials(basicAuthenticationCredentials: BasicAuthenticationCredentialsProperty.Builder.() -> Unit)

      /**
       * @param customAuthenticationCredentials The custom authentication credentials of a
       * connection.
       */
      public
          fun customAuthenticationCredentials(customAuthenticationCredentials: Map<String, String>)

      /**
       * @param customAuthenticationCredentials The custom authentication credentials of a
       * connection.
       */
      public fun customAuthenticationCredentials(customAuthenticationCredentials: IResolvable)

      /**
       * @param kmsKeyArn The KMS key ARN of a connection.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param oAuth2Properties The oAuth2 properties of a connection.
       */
      public fun oAuth2Properties(oAuth2Properties: IResolvable)

      /**
       * @param oAuth2Properties The oAuth2 properties of a connection.
       */
      public fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty)

      /**
       * @param oAuth2Properties The oAuth2 properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28f2fa0ce27a1f9fed7b349bb61a4c026b30e1d63e97cf96c9c734d4949577dd")
      public fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty.Builder.() -> Unit)

      /**
       * @param secretArn The secret ARN of a connection.
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.AuthenticationConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.AuthenticationConfigurationInputProperty.builder()

      /**
       * @param authenticationType The authentication type of a connection.
       */
      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      /**
       * @param basicAuthenticationCredentials The basic authentication credentials of a connection.
       */
      override fun basicAuthenticationCredentials(basicAuthenticationCredentials: IResolvable) {
        cdkBuilder.basicAuthenticationCredentials(basicAuthenticationCredentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param basicAuthenticationCredentials The basic authentication credentials of a connection.
       */
      override
          fun basicAuthenticationCredentials(basicAuthenticationCredentials: BasicAuthenticationCredentialsProperty) {
        cdkBuilder.basicAuthenticationCredentials(basicAuthenticationCredentials.let(BasicAuthenticationCredentialsProperty.Companion::unwrap))
      }

      /**
       * @param basicAuthenticationCredentials The basic authentication credentials of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ffd2572d52e39b8741803721b27ce89fddb5d7843e26c21f4b5468a34c34499")
      override
          fun basicAuthenticationCredentials(basicAuthenticationCredentials: BasicAuthenticationCredentialsProperty.Builder.() -> Unit):
          Unit =
          basicAuthenticationCredentials(BasicAuthenticationCredentialsProperty(basicAuthenticationCredentials))

      /**
       * @param customAuthenticationCredentials The custom authentication credentials of a
       * connection.
       */
      override
          fun customAuthenticationCredentials(customAuthenticationCredentials: Map<String, String>) {
        cdkBuilder.customAuthenticationCredentials(customAuthenticationCredentials)
      }

      /**
       * @param customAuthenticationCredentials The custom authentication credentials of a
       * connection.
       */
      override fun customAuthenticationCredentials(customAuthenticationCredentials: IResolvable) {
        cdkBuilder.customAuthenticationCredentials(customAuthenticationCredentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kmsKeyArn The KMS key ARN of a connection.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param oAuth2Properties The oAuth2 properties of a connection.
       */
      override fun oAuth2Properties(oAuth2Properties: IResolvable) {
        cdkBuilder.oAuth2Properties(oAuth2Properties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuth2Properties The oAuth2 properties of a connection.
       */
      override fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty) {
        cdkBuilder.oAuth2Properties(oAuth2Properties.let(OAuth2PropertiesProperty.Companion::unwrap))
      }

      /**
       * @param oAuth2Properties The oAuth2 properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28f2fa0ce27a1f9fed7b349bb61a4c026b30e1d63e97cf96c9c734d4949577dd")
      override fun oAuth2Properties(oAuth2Properties: OAuth2PropertiesProperty.Builder.() -> Unit):
          Unit = oAuth2Properties(OAuth2PropertiesProperty(oAuth2Properties))

      /**
       * @param secretArn The secret ARN of a connection.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.AuthenticationConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.AuthenticationConfigurationInputProperty,
    ) : CdkObject(cdkObject),
        AuthenticationConfigurationInputProperty {
      /**
       * The authentication type of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-authenticationtype)
       */
      override fun authenticationType(): String? = unwrap(this).getAuthenticationType()

      /**
       * The basic authentication credentials of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-basicauthenticationcredentials)
       */
      override fun basicAuthenticationCredentials(): Any? =
          unwrap(this).getBasicAuthenticationCredentials()

      /**
       * The custom authentication credentials of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-customauthenticationcredentials)
       */
      override fun customAuthenticationCredentials(): Any? =
          unwrap(this).getCustomAuthenticationCredentials()

      /**
       * The KMS key ARN of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The oAuth2 properties of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-oauth2properties)
       */
      override fun oAuth2Properties(): Any? = unwrap(this).getOAuth2Properties()

      /**
       * The secret ARN of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authenticationconfigurationinput.html#cfn-datazone-connection-authenticationconfigurationinput-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthenticationConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.AuthenticationConfigurationInputProperty):
          AuthenticationConfigurationInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthenticationConfigurationInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationConfigurationInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.AuthenticationConfigurationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.AuthenticationConfigurationInputProperty
    }
  }

  /**
   * The authorization code properties of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * AuthorizationCodePropertiesProperty authorizationCodePropertiesProperty =
   * AuthorizationCodePropertiesProperty.builder()
   * .authorizationCode("authorizationCode")
   * .redirectUri("redirectUri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authorizationcodeproperties.html)
   */
  public interface AuthorizationCodePropertiesProperty {
    /**
     * The authorization code of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authorizationcodeproperties.html#cfn-datazone-connection-authorizationcodeproperties-authorizationcode)
     */
    public fun authorizationCode(): String? = unwrap(this).getAuthorizationCode()

    /**
     * The redirect URI of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authorizationcodeproperties.html#cfn-datazone-connection-authorizationcodeproperties-redirecturi)
     */
    public fun redirectUri(): String? = unwrap(this).getRedirectUri()

    /**
     * A builder for [AuthorizationCodePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationCode The authorization code of a connection.
       */
      public fun authorizationCode(authorizationCode: String)

      /**
       * @param redirectUri The redirect URI of a connection.
       */
      public fun redirectUri(redirectUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.AuthorizationCodePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.AuthorizationCodePropertiesProperty.builder()

      /**
       * @param authorizationCode The authorization code of a connection.
       */
      override fun authorizationCode(authorizationCode: String) {
        cdkBuilder.authorizationCode(authorizationCode)
      }

      /**
       * @param redirectUri The redirect URI of a connection.
       */
      override fun redirectUri(redirectUri: String) {
        cdkBuilder.redirectUri(redirectUri)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.AuthorizationCodePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.AuthorizationCodePropertiesProperty,
    ) : CdkObject(cdkObject),
        AuthorizationCodePropertiesProperty {
      /**
       * The authorization code of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authorizationcodeproperties.html#cfn-datazone-connection-authorizationcodeproperties-authorizationcode)
       */
      override fun authorizationCode(): String? = unwrap(this).getAuthorizationCode()

      /**
       * The redirect URI of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-authorizationcodeproperties.html#cfn-datazone-connection-authorizationcodeproperties-redirecturi)
       */
      override fun redirectUri(): String? = unwrap(this).getRedirectUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuthorizationCodePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.AuthorizationCodePropertiesProperty):
          AuthorizationCodePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AuthorizationCodePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthorizationCodePropertiesProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.AuthorizationCodePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.AuthorizationCodePropertiesProperty
    }
  }

  /**
   * The location of a project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * AwsLocationProperty awsLocationProperty = AwsLocationProperty.builder()
   * .accessRole("accessRole")
   * .awsAccountId("awsAccountId")
   * .awsRegion("awsRegion")
   * .iamConnectionId("iamConnectionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html)
   */
  public interface AwsLocationProperty {
    /**
     * The access role of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html#cfn-datazone-connection-awslocation-accessrole)
     */
    public fun accessRole(): String? = unwrap(this).getAccessRole()

    /**
     * The account ID of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html#cfn-datazone-connection-awslocation-awsaccountid)
     */
    public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    /**
     * The Region of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html#cfn-datazone-connection-awslocation-awsregion)
     */
    public fun awsRegion(): String? = unwrap(this).getAwsRegion()

    /**
     * The IAM connection ID of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html#cfn-datazone-connection-awslocation-iamconnectionid)
     */
    public fun iamConnectionId(): String? = unwrap(this).getIamConnectionId()

    /**
     * A builder for [AwsLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessRole The access role of a connection.
       */
      public fun accessRole(accessRole: String)

      /**
       * @param awsAccountId The account ID of a connection.
       */
      public fun awsAccountId(awsAccountId: String)

      /**
       * @param awsRegion The Region of a connection.
       */
      public fun awsRegion(awsRegion: String)

      /**
       * @param iamConnectionId The IAM connection ID of a connection.
       */
      public fun iamConnectionId(iamConnectionId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.AwsLocationProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnConnection.AwsLocationProperty.builder()

      /**
       * @param accessRole The access role of a connection.
       */
      override fun accessRole(accessRole: String) {
        cdkBuilder.accessRole(accessRole)
      }

      /**
       * @param awsAccountId The account ID of a connection.
       */
      override fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
      }

      /**
       * @param awsRegion The Region of a connection.
       */
      override fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
      }

      /**
       * @param iamConnectionId The IAM connection ID of a connection.
       */
      override fun iamConnectionId(iamConnectionId: String) {
        cdkBuilder.iamConnectionId(iamConnectionId)
      }

      public fun build(): software.amazon.awscdk.services.datazone.CfnConnection.AwsLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.AwsLocationProperty,
    ) : CdkObject(cdkObject),
        AwsLocationProperty {
      /**
       * The access role of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html#cfn-datazone-connection-awslocation-accessrole)
       */
      override fun accessRole(): String? = unwrap(this).getAccessRole()

      /**
       * The account ID of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html#cfn-datazone-connection-awslocation-awsaccountid)
       */
      override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

      /**
       * The Region of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html#cfn-datazone-connection-awslocation-awsregion)
       */
      override fun awsRegion(): String? = unwrap(this).getAwsRegion()

      /**
       * The IAM connection ID of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-awslocation.html#cfn-datazone-connection-awslocation-iamconnectionid)
       */
      override fun iamConnectionId(): String? = unwrap(this).getIamConnectionId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.AwsLocationProperty):
          AwsLocationProperty = CdkObjectWrappers.wrap(cdkObject) as? AwsLocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsLocationProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.AwsLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.AwsLocationProperty
    }
  }

  /**
   * The basic authentication credentials of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * BasicAuthenticationCredentialsProperty basicAuthenticationCredentialsProperty =
   * BasicAuthenticationCredentialsProperty.builder()
   * .password("password")
   * .userName("userName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-basicauthenticationcredentials.html)
   */
  public interface BasicAuthenticationCredentialsProperty {
    /**
     * The password for a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-basicauthenticationcredentials.html#cfn-datazone-connection-basicauthenticationcredentials-password)
     */
    public fun password(): String? = unwrap(this).getPassword()

    /**
     * The user name for the connecion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-basicauthenticationcredentials.html#cfn-datazone-connection-basicauthenticationcredentials-username)
     */
    public fun userName(): String? = unwrap(this).getUserName()

    /**
     * A builder for [BasicAuthenticationCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The password for a connection.
       */
      public fun password(password: String)

      /**
       * @param userName The user name for the connecion.
       */
      public fun userName(userName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.BasicAuthenticationCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.BasicAuthenticationCredentialsProperty.builder()

      /**
       * @param password The password for a connection.
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param userName The user name for the connecion.
       */
      override fun userName(userName: String) {
        cdkBuilder.userName(userName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.BasicAuthenticationCredentialsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.BasicAuthenticationCredentialsProperty,
    ) : CdkObject(cdkObject),
        BasicAuthenticationCredentialsProperty {
      /**
       * The password for a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-basicauthenticationcredentials.html#cfn-datazone-connection-basicauthenticationcredentials-password)
       */
      override fun password(): String? = unwrap(this).getPassword()

      /**
       * The user name for the connecion.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-basicauthenticationcredentials.html#cfn-datazone-connection-basicauthenticationcredentials-username)
       */
      override fun userName(): String? = unwrap(this).getUserName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BasicAuthenticationCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.BasicAuthenticationCredentialsProperty):
          BasicAuthenticationCredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BasicAuthenticationCredentialsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthenticationCredentialsProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.BasicAuthenticationCredentialsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.BasicAuthenticationCredentialsProperty
    }
  }

  /**
   * The properties of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * ConnectionPropertiesInputProperty connectionPropertiesInputProperty =
   * ConnectionPropertiesInputProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html)
   */
  public interface ConnectionPropertiesInputProperty {
    /**
     * The Amazon Athena properties of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-athenaproperties)
     */
    public fun athenaProperties(): Any? = unwrap(this).getAthenaProperties()

    /**
     * The AWS Glue properties of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-glueproperties)
     */
    public fun glueProperties(): Any? = unwrap(this).getGlueProperties()

    /**
     * The hyper pod properties of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-hyperpodproperties)
     */
    public fun hyperPodProperties(): Any? = unwrap(this).getHyperPodProperties()

    /**
     * The IAM properties of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-iamproperties)
     */
    public fun iamProperties(): Any? = unwrap(this).getIamProperties()

    /**
     * The Amazon Redshift properties of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-redshiftproperties)
     */
    public fun redshiftProperties(): Any? = unwrap(this).getRedshiftProperties()

    /**
     * The Spark EMR properties of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-sparkemrproperties)
     */
    public fun sparkEmrProperties(): Any? = unwrap(this).getSparkEmrProperties()

    /**
     * The Spark AWS Glue properties of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-sparkglueproperties)
     */
    public fun sparkGlueProperties(): Any? = unwrap(this).getSparkGlueProperties()

    /**
     * A builder for [ConnectionPropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param athenaProperties The Amazon Athena properties of a connection.
       */
      public fun athenaProperties(athenaProperties: IResolvable)

      /**
       * @param athenaProperties The Amazon Athena properties of a connection.
       */
      public fun athenaProperties(athenaProperties: AthenaPropertiesInputProperty)

      /**
       * @param athenaProperties The Amazon Athena properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c97562cba1f0d1e417c43942604d7223f3340afe79381abd4801e76985c93f46")
      public
          fun athenaProperties(athenaProperties: AthenaPropertiesInputProperty.Builder.() -> Unit)

      /**
       * @param glueProperties The AWS Glue properties of a connection.
       */
      public fun glueProperties(glueProperties: IResolvable)

      /**
       * @param glueProperties The AWS Glue properties of a connection.
       */
      public fun glueProperties(glueProperties: GluePropertiesInputProperty)

      /**
       * @param glueProperties The AWS Glue properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2441dd085a4e0891b20949ab2bb0b38f4bbfedc56db0e647415f53edf1220f0a")
      public fun glueProperties(glueProperties: GluePropertiesInputProperty.Builder.() -> Unit)

      /**
       * @param hyperPodProperties The hyper pod properties of a connection.
       */
      public fun hyperPodProperties(hyperPodProperties: IResolvable)

      /**
       * @param hyperPodProperties The hyper pod properties of a connection.
       */
      public fun hyperPodProperties(hyperPodProperties: HyperPodPropertiesInputProperty)

      /**
       * @param hyperPodProperties The hyper pod properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5545518b57e0978ded755c891cfc52d552e4d418c3d548f68d6eb793faa8fa9")
      public
          fun hyperPodProperties(hyperPodProperties: HyperPodPropertiesInputProperty.Builder.() -> Unit)

      /**
       * @param iamProperties The IAM properties of a connection.
       */
      public fun iamProperties(iamProperties: IResolvable)

      /**
       * @param iamProperties The IAM properties of a connection.
       */
      public fun iamProperties(iamProperties: IamPropertiesInputProperty)

      /**
       * @param iamProperties The IAM properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76fee2b89e69a11c25095c3bb83bdabf9efe4bb8400e06b68d7cd868373b2d90")
      public fun iamProperties(iamProperties: IamPropertiesInputProperty.Builder.() -> Unit)

      /**
       * @param redshiftProperties The Amazon Redshift properties of a connection.
       */
      public fun redshiftProperties(redshiftProperties: IResolvable)

      /**
       * @param redshiftProperties The Amazon Redshift properties of a connection.
       */
      public fun redshiftProperties(redshiftProperties: RedshiftPropertiesInputProperty)

      /**
       * @param redshiftProperties The Amazon Redshift properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64dbdc2b8cfaf5b20e04fca77ea14438714576e1d11b3596cea43ce27665f9f4")
      public
          fun redshiftProperties(redshiftProperties: RedshiftPropertiesInputProperty.Builder.() -> Unit)

      /**
       * @param sparkEmrProperties The Spark EMR properties of a connection.
       */
      public fun sparkEmrProperties(sparkEmrProperties: IResolvable)

      /**
       * @param sparkEmrProperties The Spark EMR properties of a connection.
       */
      public fun sparkEmrProperties(sparkEmrProperties: SparkEmrPropertiesInputProperty)

      /**
       * @param sparkEmrProperties The Spark EMR properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f5d4073c634530b514ce4947b1459c13e1c76a2e7aef854f8608446a7989951")
      public
          fun sparkEmrProperties(sparkEmrProperties: SparkEmrPropertiesInputProperty.Builder.() -> Unit)

      /**
       * @param sparkGlueProperties The Spark AWS Glue properties of a connection.
       */
      public fun sparkGlueProperties(sparkGlueProperties: IResolvable)

      /**
       * @param sparkGlueProperties The Spark AWS Glue properties of a connection.
       */
      public fun sparkGlueProperties(sparkGlueProperties: SparkGluePropertiesInputProperty)

      /**
       * @param sparkGlueProperties The Spark AWS Glue properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c357789ed4fe9f57e018600de8895da0335cdc5e6038ee40b06ca04048516e")
      public
          fun sparkGlueProperties(sparkGlueProperties: SparkGluePropertiesInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.ConnectionPropertiesInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.ConnectionPropertiesInputProperty.builder()

      /**
       * @param athenaProperties The Amazon Athena properties of a connection.
       */
      override fun athenaProperties(athenaProperties: IResolvable) {
        cdkBuilder.athenaProperties(athenaProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param athenaProperties The Amazon Athena properties of a connection.
       */
      override fun athenaProperties(athenaProperties: AthenaPropertiesInputProperty) {
        cdkBuilder.athenaProperties(athenaProperties.let(AthenaPropertiesInputProperty.Companion::unwrap))
      }

      /**
       * @param athenaProperties The Amazon Athena properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c97562cba1f0d1e417c43942604d7223f3340afe79381abd4801e76985c93f46")
      override
          fun athenaProperties(athenaProperties: AthenaPropertiesInputProperty.Builder.() -> Unit):
          Unit = athenaProperties(AthenaPropertiesInputProperty(athenaProperties))

      /**
       * @param glueProperties The AWS Glue properties of a connection.
       */
      override fun glueProperties(glueProperties: IResolvable) {
        cdkBuilder.glueProperties(glueProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param glueProperties The AWS Glue properties of a connection.
       */
      override fun glueProperties(glueProperties: GluePropertiesInputProperty) {
        cdkBuilder.glueProperties(glueProperties.let(GluePropertiesInputProperty.Companion::unwrap))
      }

      /**
       * @param glueProperties The AWS Glue properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2441dd085a4e0891b20949ab2bb0b38f4bbfedc56db0e647415f53edf1220f0a")
      override fun glueProperties(glueProperties: GluePropertiesInputProperty.Builder.() -> Unit):
          Unit = glueProperties(GluePropertiesInputProperty(glueProperties))

      /**
       * @param hyperPodProperties The hyper pod properties of a connection.
       */
      override fun hyperPodProperties(hyperPodProperties: IResolvable) {
        cdkBuilder.hyperPodProperties(hyperPodProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param hyperPodProperties The hyper pod properties of a connection.
       */
      override fun hyperPodProperties(hyperPodProperties: HyperPodPropertiesInputProperty) {
        cdkBuilder.hyperPodProperties(hyperPodProperties.let(HyperPodPropertiesInputProperty.Companion::unwrap))
      }

      /**
       * @param hyperPodProperties The hyper pod properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5545518b57e0978ded755c891cfc52d552e4d418c3d548f68d6eb793faa8fa9")
      override
          fun hyperPodProperties(hyperPodProperties: HyperPodPropertiesInputProperty.Builder.() -> Unit):
          Unit = hyperPodProperties(HyperPodPropertiesInputProperty(hyperPodProperties))

      /**
       * @param iamProperties The IAM properties of a connection.
       */
      override fun iamProperties(iamProperties: IResolvable) {
        cdkBuilder.iamProperties(iamProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iamProperties The IAM properties of a connection.
       */
      override fun iamProperties(iamProperties: IamPropertiesInputProperty) {
        cdkBuilder.iamProperties(iamProperties.let(IamPropertiesInputProperty.Companion::unwrap))
      }

      /**
       * @param iamProperties The IAM properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76fee2b89e69a11c25095c3bb83bdabf9efe4bb8400e06b68d7cd868373b2d90")
      override fun iamProperties(iamProperties: IamPropertiesInputProperty.Builder.() -> Unit): Unit
          = iamProperties(IamPropertiesInputProperty(iamProperties))

      /**
       * @param redshiftProperties The Amazon Redshift properties of a connection.
       */
      override fun redshiftProperties(redshiftProperties: IResolvable) {
        cdkBuilder.redshiftProperties(redshiftProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param redshiftProperties The Amazon Redshift properties of a connection.
       */
      override fun redshiftProperties(redshiftProperties: RedshiftPropertiesInputProperty) {
        cdkBuilder.redshiftProperties(redshiftProperties.let(RedshiftPropertiesInputProperty.Companion::unwrap))
      }

      /**
       * @param redshiftProperties The Amazon Redshift properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64dbdc2b8cfaf5b20e04fca77ea14438714576e1d11b3596cea43ce27665f9f4")
      override
          fun redshiftProperties(redshiftProperties: RedshiftPropertiesInputProperty.Builder.() -> Unit):
          Unit = redshiftProperties(RedshiftPropertiesInputProperty(redshiftProperties))

      /**
       * @param sparkEmrProperties The Spark EMR properties of a connection.
       */
      override fun sparkEmrProperties(sparkEmrProperties: IResolvable) {
        cdkBuilder.sparkEmrProperties(sparkEmrProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sparkEmrProperties The Spark EMR properties of a connection.
       */
      override fun sparkEmrProperties(sparkEmrProperties: SparkEmrPropertiesInputProperty) {
        cdkBuilder.sparkEmrProperties(sparkEmrProperties.let(SparkEmrPropertiesInputProperty.Companion::unwrap))
      }

      /**
       * @param sparkEmrProperties The Spark EMR properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f5d4073c634530b514ce4947b1459c13e1c76a2e7aef854f8608446a7989951")
      override
          fun sparkEmrProperties(sparkEmrProperties: SparkEmrPropertiesInputProperty.Builder.() -> Unit):
          Unit = sparkEmrProperties(SparkEmrPropertiesInputProperty(sparkEmrProperties))

      /**
       * @param sparkGlueProperties The Spark AWS Glue properties of a connection.
       */
      override fun sparkGlueProperties(sparkGlueProperties: IResolvable) {
        cdkBuilder.sparkGlueProperties(sparkGlueProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sparkGlueProperties The Spark AWS Glue properties of a connection.
       */
      override fun sparkGlueProperties(sparkGlueProperties: SparkGluePropertiesInputProperty) {
        cdkBuilder.sparkGlueProperties(sparkGlueProperties.let(SparkGluePropertiesInputProperty.Companion::unwrap))
      }

      /**
       * @param sparkGlueProperties The Spark AWS Glue properties of a connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76c357789ed4fe9f57e018600de8895da0335cdc5e6038ee40b06ca04048516e")
      override
          fun sparkGlueProperties(sparkGlueProperties: SparkGluePropertiesInputProperty.Builder.() -> Unit):
          Unit = sparkGlueProperties(SparkGluePropertiesInputProperty(sparkGlueProperties))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.ConnectionPropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.ConnectionPropertiesInputProperty,
    ) : CdkObject(cdkObject),
        ConnectionPropertiesInputProperty {
      /**
       * The Amazon Athena properties of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-athenaproperties)
       */
      override fun athenaProperties(): Any? = unwrap(this).getAthenaProperties()

      /**
       * The AWS Glue properties of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-glueproperties)
       */
      override fun glueProperties(): Any? = unwrap(this).getGlueProperties()

      /**
       * The hyper pod properties of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-hyperpodproperties)
       */
      override fun hyperPodProperties(): Any? = unwrap(this).getHyperPodProperties()

      /**
       * The IAM properties of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-iamproperties)
       */
      override fun iamProperties(): Any? = unwrap(this).getIamProperties()

      /**
       * The Amazon Redshift properties of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-redshiftproperties)
       */
      override fun redshiftProperties(): Any? = unwrap(this).getRedshiftProperties()

      /**
       * The Spark EMR properties of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-sparkemrproperties)
       */
      override fun sparkEmrProperties(): Any? = unwrap(this).getSparkEmrProperties()

      /**
       * The Spark AWS Glue properties of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-connectionpropertiesinput.html#cfn-datazone-connection-connectionpropertiesinput-sparkglueproperties)
       */
      override fun sparkGlueProperties(): Any? = unwrap(this).getSparkGlueProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionPropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.ConnectionPropertiesInputProperty):
          ConnectionPropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionPropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionPropertiesInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.ConnectionPropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.ConnectionPropertiesInputProperty
    }
  }

  /**
   * The AWS Glue connecton input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * GlueConnectionInputProperty glueConnectionInputProperty = GlueConnectionInputProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html)
   */
  public interface GlueConnectionInputProperty {
    /**
     * The Amazon Athena properties of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-athenaproperties)
     */
    public fun athenaProperties(): Any? = unwrap(this).getAthenaProperties()

    /**
     * The authentication configuration of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-authenticationconfiguration)
     */
    public fun authenticationConfiguration(): Any? = unwrap(this).getAuthenticationConfiguration()

    /**
     * The connection properties of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-connectionproperties)
     */
    public fun connectionProperties(): Any? = unwrap(this).getConnectionProperties()

    /**
     * The connection type of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-connectiontype)
     */
    public fun connectionType(): String? = unwrap(this).getConnectionType()

    /**
     * The description of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The match criteria of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-matchcriteria)
     */
    public fun matchCriteria(): String? = unwrap(this).getMatchCriteria()

    /**
     * The name of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The physical connection requirements for the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-physicalconnectionrequirements)
     */
    public fun physicalConnectionRequirements(): Any? =
        unwrap(this).getPhysicalConnectionRequirements()

    /**
     * The Python properties of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-pythonproperties)
     */
    public fun pythonProperties(): Any? = unwrap(this).getPythonProperties()

    /**
     * The Spark properties of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-sparkproperties)
     */
    public fun sparkProperties(): Any? = unwrap(this).getSparkProperties()

    /**
     * Speciefies whether to validate credentials of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-validatecredentials)
     */
    public fun validateCredentials(): Any? = unwrap(this).getValidateCredentials()

    /**
     * Speciefies whether to validate for compute environments of the AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-validateforcomputeenvironments)
     */
    public fun validateForComputeEnvironments(): List<String> =
        unwrap(this).getValidateForComputeEnvironments() ?: emptyList()

    /**
     * A builder for [GlueConnectionInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param athenaProperties The Amazon Athena properties of the AWS Glue connection.
       */
      public fun athenaProperties(athenaProperties: Map<String, String>)

      /**
       * @param athenaProperties The Amazon Athena properties of the AWS Glue connection.
       */
      public fun athenaProperties(athenaProperties: IResolvable)

      /**
       * @param authenticationConfiguration The authentication configuration of the AWS Glue
       * connection.
       */
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

      /**
       * @param authenticationConfiguration The authentication configuration of the AWS Glue
       * connection.
       */
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationInputProperty)

      /**
       * @param authenticationConfiguration The authentication configuration of the AWS Glue
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31632bcec9351649a2bc21dee90c95747351dee1bf4589c461ce57625a82b199")
      public
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationInputProperty.Builder.() -> Unit)

      /**
       * @param connectionProperties The connection properties of the AWS Glue connection.
       */
      public fun connectionProperties(connectionProperties: Map<String, String>)

      /**
       * @param connectionProperties The connection properties of the AWS Glue connection.
       */
      public fun connectionProperties(connectionProperties: IResolvable)

      /**
       * @param connectionType The connection type of the AWS Glue connection.
       */
      public fun connectionType(connectionType: String)

      /**
       * @param description The description of the AWS Glue connection.
       */
      public fun description(description: String)

      /**
       * @param matchCriteria The match criteria of the AWS Glue connection.
       */
      public fun matchCriteria(matchCriteria: String)

      /**
       * @param name The name of the AWS Glue connection.
       */
      public fun name(name: String)

      /**
       * @param physicalConnectionRequirements The physical connection requirements for the AWS Glue
       * connection.
       */
      public fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable)

      /**
       * @param physicalConnectionRequirements The physical connection requirements for the AWS Glue
       * connection.
       */
      public
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty)

      /**
       * @param physicalConnectionRequirements The physical connection requirements for the AWS Glue
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8b363bb5d45353c3b27924efad25b4eec6a47276ccdd1b80c475c5f1b8dae7b")
      public
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty.Builder.() -> Unit)

      /**
       * @param pythonProperties The Python properties of the AWS Glue connection.
       */
      public fun pythonProperties(pythonProperties: Map<String, String>)

      /**
       * @param pythonProperties The Python properties of the AWS Glue connection.
       */
      public fun pythonProperties(pythonProperties: IResolvable)

      /**
       * @param sparkProperties The Spark properties of the AWS Glue connection.
       */
      public fun sparkProperties(sparkProperties: Map<String, String>)

      /**
       * @param sparkProperties The Spark properties of the AWS Glue connection.
       */
      public fun sparkProperties(sparkProperties: IResolvable)

      /**
       * @param validateCredentials Speciefies whether to validate credentials of the AWS Glue
       * connection.
       */
      public fun validateCredentials(validateCredentials: Boolean)

      /**
       * @param validateCredentials Speciefies whether to validate credentials of the AWS Glue
       * connection.
       */
      public fun validateCredentials(validateCredentials: IResolvable)

      /**
       * @param validateForComputeEnvironments Speciefies whether to validate for compute
       * environments of the AWS Glue connection.
       */
      public fun validateForComputeEnvironments(validateForComputeEnvironments: List<String>)

      /**
       * @param validateForComputeEnvironments Speciefies whether to validate for compute
       * environments of the AWS Glue connection.
       */
      public fun validateForComputeEnvironments(vararg validateForComputeEnvironments: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.GlueConnectionInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.GlueConnectionInputProperty.builder()

      /**
       * @param athenaProperties The Amazon Athena properties of the AWS Glue connection.
       */
      override fun athenaProperties(athenaProperties: Map<String, String>) {
        cdkBuilder.athenaProperties(athenaProperties)
      }

      /**
       * @param athenaProperties The Amazon Athena properties of the AWS Glue connection.
       */
      override fun athenaProperties(athenaProperties: IResolvable) {
        cdkBuilder.athenaProperties(athenaProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authenticationConfiguration The authentication configuration of the AWS Glue
       * connection.
       */
      override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authenticationConfiguration The authentication configuration of the AWS Glue
       * connection.
       */
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationInputProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(AuthenticationConfigurationInputProperty.Companion::unwrap))
      }

      /**
       * @param authenticationConfiguration The authentication configuration of the AWS Glue
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31632bcec9351649a2bc21dee90c95747351dee1bf4589c461ce57625a82b199")
      override
          fun authenticationConfiguration(authenticationConfiguration: AuthenticationConfigurationInputProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(AuthenticationConfigurationInputProperty(authenticationConfiguration))

      /**
       * @param connectionProperties The connection properties of the AWS Glue connection.
       */
      override fun connectionProperties(connectionProperties: Map<String, String>) {
        cdkBuilder.connectionProperties(connectionProperties)
      }

      /**
       * @param connectionProperties The connection properties of the AWS Glue connection.
       */
      override fun connectionProperties(connectionProperties: IResolvable) {
        cdkBuilder.connectionProperties(connectionProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param connectionType The connection type of the AWS Glue connection.
       */
      override fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
      }

      /**
       * @param description The description of the AWS Glue connection.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param matchCriteria The match criteria of the AWS Glue connection.
       */
      override fun matchCriteria(matchCriteria: String) {
        cdkBuilder.matchCriteria(matchCriteria)
      }

      /**
       * @param name The name of the AWS Glue connection.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param physicalConnectionRequirements The physical connection requirements for the AWS Glue
       * connection.
       */
      override fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param physicalConnectionRequirements The physical connection requirements for the AWS Glue
       * connection.
       */
      override
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements.let(PhysicalConnectionRequirementsProperty.Companion::unwrap))
      }

      /**
       * @param physicalConnectionRequirements The physical connection requirements for the AWS Glue
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8b363bb5d45353c3b27924efad25b4eec6a47276ccdd1b80c475c5f1b8dae7b")
      override
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty.Builder.() -> Unit):
          Unit =
          physicalConnectionRequirements(PhysicalConnectionRequirementsProperty(physicalConnectionRequirements))

      /**
       * @param pythonProperties The Python properties of the AWS Glue connection.
       */
      override fun pythonProperties(pythonProperties: Map<String, String>) {
        cdkBuilder.pythonProperties(pythonProperties)
      }

      /**
       * @param pythonProperties The Python properties of the AWS Glue connection.
       */
      override fun pythonProperties(pythonProperties: IResolvable) {
        cdkBuilder.pythonProperties(pythonProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sparkProperties The Spark properties of the AWS Glue connection.
       */
      override fun sparkProperties(sparkProperties: Map<String, String>) {
        cdkBuilder.sparkProperties(sparkProperties)
      }

      /**
       * @param sparkProperties The Spark properties of the AWS Glue connection.
       */
      override fun sparkProperties(sparkProperties: IResolvable) {
        cdkBuilder.sparkProperties(sparkProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param validateCredentials Speciefies whether to validate credentials of the AWS Glue
       * connection.
       */
      override fun validateCredentials(validateCredentials: Boolean) {
        cdkBuilder.validateCredentials(validateCredentials)
      }

      /**
       * @param validateCredentials Speciefies whether to validate credentials of the AWS Glue
       * connection.
       */
      override fun validateCredentials(validateCredentials: IResolvable) {
        cdkBuilder.validateCredentials(validateCredentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param validateForComputeEnvironments Speciefies whether to validate for compute
       * environments of the AWS Glue connection.
       */
      override fun validateForComputeEnvironments(validateForComputeEnvironments: List<String>) {
        cdkBuilder.validateForComputeEnvironments(validateForComputeEnvironments)
      }

      /**
       * @param validateForComputeEnvironments Speciefies whether to validate for compute
       * environments of the AWS Glue connection.
       */
      override fun validateForComputeEnvironments(vararg validateForComputeEnvironments: String):
          Unit = validateForComputeEnvironments(validateForComputeEnvironments.toList())

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.GlueConnectionInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.GlueConnectionInputProperty,
    ) : CdkObject(cdkObject),
        GlueConnectionInputProperty {
      /**
       * The Amazon Athena properties of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-athenaproperties)
       */
      override fun athenaProperties(): Any? = unwrap(this).getAthenaProperties()

      /**
       * The authentication configuration of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-authenticationconfiguration)
       */
      override fun authenticationConfiguration(): Any? =
          unwrap(this).getAuthenticationConfiguration()

      /**
       * The connection properties of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-connectionproperties)
       */
      override fun connectionProperties(): Any? = unwrap(this).getConnectionProperties()

      /**
       * The connection type of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-connectiontype)
       */
      override fun connectionType(): String? = unwrap(this).getConnectionType()

      /**
       * The description of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The match criteria of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-matchcriteria)
       */
      override fun matchCriteria(): String? = unwrap(this).getMatchCriteria()

      /**
       * The name of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The physical connection requirements for the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-physicalconnectionrequirements)
       */
      override fun physicalConnectionRequirements(): Any? =
          unwrap(this).getPhysicalConnectionRequirements()

      /**
       * The Python properties of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-pythonproperties)
       */
      override fun pythonProperties(): Any? = unwrap(this).getPythonProperties()

      /**
       * The Spark properties of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-sparkproperties)
       */
      override fun sparkProperties(): Any? = unwrap(this).getSparkProperties()

      /**
       * Speciefies whether to validate credentials of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-validatecredentials)
       */
      override fun validateCredentials(): Any? = unwrap(this).getValidateCredentials()

      /**
       * Speciefies whether to validate for compute environments of the AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueconnectioninput.html#cfn-datazone-connection-glueconnectioninput-validateforcomputeenvironments)
       */
      override fun validateForComputeEnvironments(): List<String> =
          unwrap(this).getValidateForComputeEnvironments() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlueConnectionInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.GlueConnectionInputProperty):
          GlueConnectionInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GlueConnectionInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueConnectionInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.GlueConnectionInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.GlueConnectionInputProperty
    }
  }

  /**
   * The GlueOAuth2 credentials of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * GlueOAuth2CredentialsProperty glueOAuth2CredentialsProperty =
   * GlueOAuth2CredentialsProperty.builder()
   * .accessToken("accessToken")
   * .jwtToken("jwtToken")
   * .refreshToken("refreshToken")
   * .userManagedClientApplicationClientSecret("userManagedClientApplicationClientSecret")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html)
   */
  public interface GlueOAuth2CredentialsProperty {
    /**
     * The access token of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html#cfn-datazone-connection-glueoauth2credentials-accesstoken)
     */
    public fun accessToken(): String? = unwrap(this).getAccessToken()

    /**
     * The jwt token of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html#cfn-datazone-connection-glueoauth2credentials-jwttoken)
     */
    public fun jwtToken(): String? = unwrap(this).getJwtToken()

    /**
     * The refresh token of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html#cfn-datazone-connection-glueoauth2credentials-refreshtoken)
     */
    public fun refreshToken(): String? = unwrap(this).getRefreshToken()

    /**
     * The user managed client application client secret of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html#cfn-datazone-connection-glueoauth2credentials-usermanagedclientapplicationclientsecret)
     */
    public fun userManagedClientApplicationClientSecret(): String? =
        unwrap(this).getUserManagedClientApplicationClientSecret()

    /**
     * A builder for [GlueOAuth2CredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessToken The access token of a connection.
       */
      public fun accessToken(accessToken: String)

      /**
       * @param jwtToken The jwt token of the connection.
       */
      public fun jwtToken(jwtToken: String)

      /**
       * @param refreshToken The refresh token of the connection.
       */
      public fun refreshToken(refreshToken: String)

      /**
       * @param userManagedClientApplicationClientSecret The user managed client application client
       * secret of the connection.
       */
      public
          fun userManagedClientApplicationClientSecret(userManagedClientApplicationClientSecret: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.GlueOAuth2CredentialsProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.GlueOAuth2CredentialsProperty.builder()

      /**
       * @param accessToken The access token of a connection.
       */
      override fun accessToken(accessToken: String) {
        cdkBuilder.accessToken(accessToken)
      }

      /**
       * @param jwtToken The jwt token of the connection.
       */
      override fun jwtToken(jwtToken: String) {
        cdkBuilder.jwtToken(jwtToken)
      }

      /**
       * @param refreshToken The refresh token of the connection.
       */
      override fun refreshToken(refreshToken: String) {
        cdkBuilder.refreshToken(refreshToken)
      }

      /**
       * @param userManagedClientApplicationClientSecret The user managed client application client
       * secret of the connection.
       */
      override
          fun userManagedClientApplicationClientSecret(userManagedClientApplicationClientSecret: String) {
        cdkBuilder.userManagedClientApplicationClientSecret(userManagedClientApplicationClientSecret)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.GlueOAuth2CredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.GlueOAuth2CredentialsProperty,
    ) : CdkObject(cdkObject),
        GlueOAuth2CredentialsProperty {
      /**
       * The access token of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html#cfn-datazone-connection-glueoauth2credentials-accesstoken)
       */
      override fun accessToken(): String? = unwrap(this).getAccessToken()

      /**
       * The jwt token of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html#cfn-datazone-connection-glueoauth2credentials-jwttoken)
       */
      override fun jwtToken(): String? = unwrap(this).getJwtToken()

      /**
       * The refresh token of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html#cfn-datazone-connection-glueoauth2credentials-refreshtoken)
       */
      override fun refreshToken(): String? = unwrap(this).getRefreshToken()

      /**
       * The user managed client application client secret of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-glueoauth2credentials.html#cfn-datazone-connection-glueoauth2credentials-usermanagedclientapplicationclientsecret)
       */
      override fun userManagedClientApplicationClientSecret(): String? =
          unwrap(this).getUserManagedClientApplicationClientSecret()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlueOAuth2CredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.GlueOAuth2CredentialsProperty):
          GlueOAuth2CredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GlueOAuth2CredentialsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueOAuth2CredentialsProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.GlueOAuth2CredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.GlueOAuth2CredentialsProperty
    }
  }

  /**
   * The AWS Glue properties of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * GluePropertiesInputProperty gluePropertiesInputProperty = GluePropertiesInputProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-gluepropertiesinput.html)
   */
  public interface GluePropertiesInputProperty {
    /**
     * The AWS Glue connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-gluepropertiesinput.html#cfn-datazone-connection-gluepropertiesinput-glueconnectioninput)
     */
    public fun glueConnectionInput(): Any? = unwrap(this).getGlueConnectionInput()

    /**
     * A builder for [GluePropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param glueConnectionInput The AWS Glue connection.
       */
      public fun glueConnectionInput(glueConnectionInput: IResolvable)

      /**
       * @param glueConnectionInput The AWS Glue connection.
       */
      public fun glueConnectionInput(glueConnectionInput: GlueConnectionInputProperty)

      /**
       * @param glueConnectionInput The AWS Glue connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b43c6a74f4ba2caa71cd91dde87e84132c1221804273f4e65a6eee64c22d304d")
      public
          fun glueConnectionInput(glueConnectionInput: GlueConnectionInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.GluePropertiesInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.GluePropertiesInputProperty.builder()

      /**
       * @param glueConnectionInput The AWS Glue connection.
       */
      override fun glueConnectionInput(glueConnectionInput: IResolvable) {
        cdkBuilder.glueConnectionInput(glueConnectionInput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param glueConnectionInput The AWS Glue connection.
       */
      override fun glueConnectionInput(glueConnectionInput: GlueConnectionInputProperty) {
        cdkBuilder.glueConnectionInput(glueConnectionInput.let(GlueConnectionInputProperty.Companion::unwrap))
      }

      /**
       * @param glueConnectionInput The AWS Glue connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b43c6a74f4ba2caa71cd91dde87e84132c1221804273f4e65a6eee64c22d304d")
      override
          fun glueConnectionInput(glueConnectionInput: GlueConnectionInputProperty.Builder.() -> Unit):
          Unit = glueConnectionInput(GlueConnectionInputProperty(glueConnectionInput))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.GluePropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.GluePropertiesInputProperty,
    ) : CdkObject(cdkObject),
        GluePropertiesInputProperty {
      /**
       * The AWS Glue connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-gluepropertiesinput.html#cfn-datazone-connection-gluepropertiesinput-glueconnectioninput)
       */
      override fun glueConnectionInput(): Any? = unwrap(this).getGlueConnectionInput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GluePropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.GluePropertiesInputProperty):
          GluePropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GluePropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GluePropertiesInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.GluePropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.GluePropertiesInputProperty
    }
  }

  /**
   * The hyper pod properties of a AWS Glue properties patch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * HyperPodPropertiesInputProperty hyperPodPropertiesInputProperty =
   * HyperPodPropertiesInputProperty.builder()
   * .clusterName("clusterName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-hyperpodpropertiesinput.html)
   */
  public interface HyperPodPropertiesInputProperty {
    /**
     * The cluster name the hyper pod properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-hyperpodpropertiesinput.html#cfn-datazone-connection-hyperpodpropertiesinput-clustername)
     */
    public fun clusterName(): String

    /**
     * A builder for [HyperPodPropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterName The cluster name the hyper pod properties. 
       */
      public fun clusterName(clusterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.HyperPodPropertiesInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.HyperPodPropertiesInputProperty.builder()

      /**
       * @param clusterName The cluster name the hyper pod properties. 
       */
      override fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.HyperPodPropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.HyperPodPropertiesInputProperty,
    ) : CdkObject(cdkObject),
        HyperPodPropertiesInputProperty {
      /**
       * The cluster name the hyper pod properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-hyperpodpropertiesinput.html#cfn-datazone-connection-hyperpodpropertiesinput-clustername)
       */
      override fun clusterName(): String = unwrap(this).getClusterName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HyperPodPropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.HyperPodPropertiesInputProperty):
          HyperPodPropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HyperPodPropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HyperPodPropertiesInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.HyperPodPropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.HyperPodPropertiesInputProperty
    }
  }

  /**
   * The IAM properties of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * IamPropertiesInputProperty iamPropertiesInputProperty = IamPropertiesInputProperty.builder()
   * .glueLineageSyncEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-iampropertiesinput.html)
   */
  public interface IamPropertiesInputProperty {
    /**
     * Specifies whether AWS Glue lineage sync is enabled for a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-iampropertiesinput.html#cfn-datazone-connection-iampropertiesinput-gluelineagesyncenabled)
     */
    public fun glueLineageSyncEnabled(): Any? = unwrap(this).getGlueLineageSyncEnabled()

    /**
     * A builder for [IamPropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param glueLineageSyncEnabled Specifies whether AWS Glue lineage sync is enabled for a
       * connection.
       */
      public fun glueLineageSyncEnabled(glueLineageSyncEnabled: Boolean)

      /**
       * @param glueLineageSyncEnabled Specifies whether AWS Glue lineage sync is enabled for a
       * connection.
       */
      public fun glueLineageSyncEnabled(glueLineageSyncEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.IamPropertiesInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.IamPropertiesInputProperty.builder()

      /**
       * @param glueLineageSyncEnabled Specifies whether AWS Glue lineage sync is enabled for a
       * connection.
       */
      override fun glueLineageSyncEnabled(glueLineageSyncEnabled: Boolean) {
        cdkBuilder.glueLineageSyncEnabled(glueLineageSyncEnabled)
      }

      /**
       * @param glueLineageSyncEnabled Specifies whether AWS Glue lineage sync is enabled for a
       * connection.
       */
      override fun glueLineageSyncEnabled(glueLineageSyncEnabled: IResolvable) {
        cdkBuilder.glueLineageSyncEnabled(glueLineageSyncEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.IamPropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.IamPropertiesInputProperty,
    ) : CdkObject(cdkObject),
        IamPropertiesInputProperty {
      /**
       * Specifies whether AWS Glue lineage sync is enabled for a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-iampropertiesinput.html#cfn-datazone-connection-iampropertiesinput-gluelineagesyncenabled)
       */
      override fun glueLineageSyncEnabled(): Any? = unwrap(this).getGlueLineageSyncEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IamPropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.IamPropertiesInputProperty):
          IamPropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IamPropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IamPropertiesInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.IamPropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.IamPropertiesInputProperty
    }
  }

  /**
   * The lineage sync schedule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * LineageSyncScheduleProperty lineageSyncScheduleProperty = LineageSyncScheduleProperty.builder()
   * .schedule("schedule")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-lineagesyncschedule.html)
   */
  public interface LineageSyncScheduleProperty {
    /**
     * The lineage sync schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-lineagesyncschedule.html#cfn-datazone-connection-lineagesyncschedule-schedule)
     */
    public fun schedule(): String? = unwrap(this).getSchedule()

    /**
     * A builder for [LineageSyncScheduleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param schedule The lineage sync schedule.
       */
      public fun schedule(schedule: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.LineageSyncScheduleProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.LineageSyncScheduleProperty.builder()

      /**
       * @param schedule The lineage sync schedule.
       */
      override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.LineageSyncScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.LineageSyncScheduleProperty,
    ) : CdkObject(cdkObject),
        LineageSyncScheduleProperty {
      /**
       * The lineage sync schedule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-lineagesyncschedule.html#cfn-datazone-connection-lineagesyncschedule-schedule)
       */
      override fun schedule(): String? = unwrap(this).getSchedule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LineageSyncScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.LineageSyncScheduleProperty):
          LineageSyncScheduleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LineageSyncScheduleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LineageSyncScheduleProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.LineageSyncScheduleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.LineageSyncScheduleProperty
    }
  }

  /**
   * The OAuth2Client application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * OAuth2ClientApplicationProperty oAuth2ClientApplicationProperty =
   * OAuth2ClientApplicationProperty.builder()
   * .awsManagedClientApplicationReference("awsManagedClientApplicationReference")
   * .userManagedClientApplicationClientId("userManagedClientApplicationClientId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2clientapplication.html)
   */
  public interface OAuth2ClientApplicationProperty {
    /**
     * The AWS managed client application reference in the OAuth2Client application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2clientapplication.html#cfn-datazone-connection-oauth2clientapplication-awsmanagedclientapplicationreference)
     */
    public fun awsManagedClientApplicationReference(): String? =
        unwrap(this).getAwsManagedClientApplicationReference()

    /**
     * The user managed client application client ID in the OAuth2Client application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2clientapplication.html#cfn-datazone-connection-oauth2clientapplication-usermanagedclientapplicationclientid)
     */
    public fun userManagedClientApplicationClientId(): String? =
        unwrap(this).getUserManagedClientApplicationClientId()

    /**
     * A builder for [OAuth2ClientApplicationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsManagedClientApplicationReference The AWS managed client application reference in
       * the OAuth2Client application.
       */
      public fun awsManagedClientApplicationReference(awsManagedClientApplicationReference: String)

      /**
       * @param userManagedClientApplicationClientId The user managed client application client ID
       * in the OAuth2Client application.
       */
      public fun userManagedClientApplicationClientId(userManagedClientApplicationClientId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2ClientApplicationProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2ClientApplicationProperty.builder()

      /**
       * @param awsManagedClientApplicationReference The AWS managed client application reference in
       * the OAuth2Client application.
       */
      override
          fun awsManagedClientApplicationReference(awsManagedClientApplicationReference: String) {
        cdkBuilder.awsManagedClientApplicationReference(awsManagedClientApplicationReference)
      }

      /**
       * @param userManagedClientApplicationClientId The user managed client application client ID
       * in the OAuth2Client application.
       */
      override
          fun userManagedClientApplicationClientId(userManagedClientApplicationClientId: String) {
        cdkBuilder.userManagedClientApplicationClientId(userManagedClientApplicationClientId)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2ClientApplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.OAuth2ClientApplicationProperty,
    ) : CdkObject(cdkObject),
        OAuth2ClientApplicationProperty {
      /**
       * The AWS managed client application reference in the OAuth2Client application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2clientapplication.html#cfn-datazone-connection-oauth2clientapplication-awsmanagedclientapplicationreference)
       */
      override fun awsManagedClientApplicationReference(): String? =
          unwrap(this).getAwsManagedClientApplicationReference()

      /**
       * The user managed client application client ID in the OAuth2Client application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2clientapplication.html#cfn-datazone-connection-oauth2clientapplication-usermanagedclientapplicationclientid)
       */
      override fun userManagedClientApplicationClientId(): String? =
          unwrap(this).getUserManagedClientApplicationClientId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2ClientApplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.OAuth2ClientApplicationProperty):
          OAuth2ClientApplicationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OAuth2ClientApplicationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2ClientApplicationProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2ClientApplicationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2ClientApplicationProperty
    }
  }

  /**
   * The OAuth2 properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * OAuth2PropertiesProperty oAuth2PropertiesProperty = OAuth2PropertiesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html)
   */
  public interface OAuth2PropertiesProperty {
    /**
     * The authorization code properties of the OAuth2 properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-authorizationcodeproperties)
     */
    public fun authorizationCodeProperties(): Any? = unwrap(this).getAuthorizationCodeProperties()

    /**
     * The OAuth2 client application of the OAuth2 properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-oauth2clientapplication)
     */
    public fun oAuth2ClientApplication(): Any? = unwrap(this).getOAuth2ClientApplication()

    /**
     * The OAuth2 credentials of the OAuth2 properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-oauth2credentials)
     */
    public fun oAuth2Credentials(): Any? = unwrap(this).getOAuth2Credentials()

    /**
     * The OAuth2 grant type of the OAuth2 properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-oauth2granttype)
     */
    public fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

    /**
     * The OAuth2 token URL of the OAuth2 properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-tokenurl)
     */
    public fun tokenUrl(): String? = unwrap(this).getTokenUrl()

    /**
     * The OAuth2 token URL parameter map of the OAuth2 properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-tokenurlparametersmap)
     */
    public fun tokenUrlParametersMap(): Any? = unwrap(this).getTokenUrlParametersMap()

    /**
     * A builder for [OAuth2PropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationCodeProperties The authorization code properties of the OAuth2
       * properties.
       */
      public fun authorizationCodeProperties(authorizationCodeProperties: IResolvable)

      /**
       * @param authorizationCodeProperties The authorization code properties of the OAuth2
       * properties.
       */
      public
          fun authorizationCodeProperties(authorizationCodeProperties: AuthorizationCodePropertiesProperty)

      /**
       * @param authorizationCodeProperties The authorization code properties of the OAuth2
       * properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b50686725408e509961872bcdd943c77dff378cf5d27f7c0a73fe840d1285b56")
      public
          fun authorizationCodeProperties(authorizationCodeProperties: AuthorizationCodePropertiesProperty.Builder.() -> Unit)

      /**
       * @param oAuth2ClientApplication The OAuth2 client application of the OAuth2 properties.
       */
      public fun oAuth2ClientApplication(oAuth2ClientApplication: IResolvable)

      /**
       * @param oAuth2ClientApplication The OAuth2 client application of the OAuth2 properties.
       */
      public fun oAuth2ClientApplication(oAuth2ClientApplication: OAuth2ClientApplicationProperty)

      /**
       * @param oAuth2ClientApplication The OAuth2 client application of the OAuth2 properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("720211f4e1ac501c57493d6ddb3ff0253c3f5066dc7d9b3509e2718a69ffa9e9")
      public
          fun oAuth2ClientApplication(oAuth2ClientApplication: OAuth2ClientApplicationProperty.Builder.() -> Unit)

      /**
       * @param oAuth2Credentials The OAuth2 credentials of the OAuth2 properties.
       */
      public fun oAuth2Credentials(oAuth2Credentials: IResolvable)

      /**
       * @param oAuth2Credentials The OAuth2 credentials of the OAuth2 properties.
       */
      public fun oAuth2Credentials(oAuth2Credentials: GlueOAuth2CredentialsProperty)

      /**
       * @param oAuth2Credentials The OAuth2 credentials of the OAuth2 properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43b717a7c8080c345a5126220cbf6ca4ce5f27e3190ae4762b55e32e26825b1c")
      public
          fun oAuth2Credentials(oAuth2Credentials: GlueOAuth2CredentialsProperty.Builder.() -> Unit)

      /**
       * @param oAuth2GrantType The OAuth2 grant type of the OAuth2 properties.
       */
      public fun oAuth2GrantType(oAuth2GrantType: String)

      /**
       * @param tokenUrl The OAuth2 token URL of the OAuth2 properties.
       */
      public fun tokenUrl(tokenUrl: String)

      /**
       * @param tokenUrlParametersMap The OAuth2 token URL parameter map of the OAuth2 properties.
       */
      public fun tokenUrlParametersMap(tokenUrlParametersMap: Map<String, String>)

      /**
       * @param tokenUrlParametersMap The OAuth2 token URL parameter map of the OAuth2 properties.
       */
      public fun tokenUrlParametersMap(tokenUrlParametersMap: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2PropertiesProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2PropertiesProperty.builder()

      /**
       * @param authorizationCodeProperties The authorization code properties of the OAuth2
       * properties.
       */
      override fun authorizationCodeProperties(authorizationCodeProperties: IResolvable) {
        cdkBuilder.authorizationCodeProperties(authorizationCodeProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param authorizationCodeProperties The authorization code properties of the OAuth2
       * properties.
       */
      override
          fun authorizationCodeProperties(authorizationCodeProperties: AuthorizationCodePropertiesProperty) {
        cdkBuilder.authorizationCodeProperties(authorizationCodeProperties.let(AuthorizationCodePropertiesProperty.Companion::unwrap))
      }

      /**
       * @param authorizationCodeProperties The authorization code properties of the OAuth2
       * properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b50686725408e509961872bcdd943c77dff378cf5d27f7c0a73fe840d1285b56")
      override
          fun authorizationCodeProperties(authorizationCodeProperties: AuthorizationCodePropertiesProperty.Builder.() -> Unit):
          Unit =
          authorizationCodeProperties(AuthorizationCodePropertiesProperty(authorizationCodeProperties))

      /**
       * @param oAuth2ClientApplication The OAuth2 client application of the OAuth2 properties.
       */
      override fun oAuth2ClientApplication(oAuth2ClientApplication: IResolvable) {
        cdkBuilder.oAuth2ClientApplication(oAuth2ClientApplication.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuth2ClientApplication The OAuth2 client application of the OAuth2 properties.
       */
      override
          fun oAuth2ClientApplication(oAuth2ClientApplication: OAuth2ClientApplicationProperty) {
        cdkBuilder.oAuth2ClientApplication(oAuth2ClientApplication.let(OAuth2ClientApplicationProperty.Companion::unwrap))
      }

      /**
       * @param oAuth2ClientApplication The OAuth2 client application of the OAuth2 properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("720211f4e1ac501c57493d6ddb3ff0253c3f5066dc7d9b3509e2718a69ffa9e9")
      override
          fun oAuth2ClientApplication(oAuth2ClientApplication: OAuth2ClientApplicationProperty.Builder.() -> Unit):
          Unit = oAuth2ClientApplication(OAuth2ClientApplicationProperty(oAuth2ClientApplication))

      /**
       * @param oAuth2Credentials The OAuth2 credentials of the OAuth2 properties.
       */
      override fun oAuth2Credentials(oAuth2Credentials: IResolvable) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuth2Credentials The OAuth2 credentials of the OAuth2 properties.
       */
      override fun oAuth2Credentials(oAuth2Credentials: GlueOAuth2CredentialsProperty) {
        cdkBuilder.oAuth2Credentials(oAuth2Credentials.let(GlueOAuth2CredentialsProperty.Companion::unwrap))
      }

      /**
       * @param oAuth2Credentials The OAuth2 credentials of the OAuth2 properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43b717a7c8080c345a5126220cbf6ca4ce5f27e3190ae4762b55e32e26825b1c")
      override
          fun oAuth2Credentials(oAuth2Credentials: GlueOAuth2CredentialsProperty.Builder.() -> Unit):
          Unit = oAuth2Credentials(GlueOAuth2CredentialsProperty(oAuth2Credentials))

      /**
       * @param oAuth2GrantType The OAuth2 grant type of the OAuth2 properties.
       */
      override fun oAuth2GrantType(oAuth2GrantType: String) {
        cdkBuilder.oAuth2GrantType(oAuth2GrantType)
      }

      /**
       * @param tokenUrl The OAuth2 token URL of the OAuth2 properties.
       */
      override fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
      }

      /**
       * @param tokenUrlParametersMap The OAuth2 token URL parameter map of the OAuth2 properties.
       */
      override fun tokenUrlParametersMap(tokenUrlParametersMap: Map<String, String>) {
        cdkBuilder.tokenUrlParametersMap(tokenUrlParametersMap)
      }

      /**
       * @param tokenUrlParametersMap The OAuth2 token URL parameter map of the OAuth2 properties.
       */
      override fun tokenUrlParametersMap(tokenUrlParametersMap: IResolvable) {
        cdkBuilder.tokenUrlParametersMap(tokenUrlParametersMap.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2PropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.OAuth2PropertiesProperty,
    ) : CdkObject(cdkObject),
        OAuth2PropertiesProperty {
      /**
       * The authorization code properties of the OAuth2 properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-authorizationcodeproperties)
       */
      override fun authorizationCodeProperties(): Any? =
          unwrap(this).getAuthorizationCodeProperties()

      /**
       * The OAuth2 client application of the OAuth2 properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-oauth2clientapplication)
       */
      override fun oAuth2ClientApplication(): Any? = unwrap(this).getOAuth2ClientApplication()

      /**
       * The OAuth2 credentials of the OAuth2 properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-oauth2credentials)
       */
      override fun oAuth2Credentials(): Any? = unwrap(this).getOAuth2Credentials()

      /**
       * The OAuth2 grant type of the OAuth2 properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-oauth2granttype)
       */
      override fun oAuth2GrantType(): String? = unwrap(this).getOAuth2GrantType()

      /**
       * The OAuth2 token URL of the OAuth2 properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-tokenurl)
       */
      override fun tokenUrl(): String? = unwrap(this).getTokenUrl()

      /**
       * The OAuth2 token URL parameter map of the OAuth2 properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-oauth2properties.html#cfn-datazone-connection-oauth2properties-tokenurlparametersmap)
       */
      override fun tokenUrlParametersMap(): Any? = unwrap(this).getTokenUrlParametersMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OAuth2PropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.OAuth2PropertiesProperty):
          OAuth2PropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as? OAuth2PropertiesProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2PropertiesProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2PropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.OAuth2PropertiesProperty
    }
  }

  /**
   * Physical connection requirements of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * PhysicalConnectionRequirementsProperty physicalConnectionRequirementsProperty =
   * PhysicalConnectionRequirementsProperty.builder()
   * .availabilityZone("availabilityZone")
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetId("subnetId")
   * .subnetIdList(List.of("subnetIdList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html)
   */
  public interface PhysicalConnectionRequirementsProperty {
    /**
     * The availability zone of the physical connection requirements of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html#cfn-datazone-connection-physicalconnectionrequirements-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The group ID list of the physical connection requirements of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html#cfn-datazone-connection-physicalconnectionrequirements-securitygroupidlist)
     */
    public fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList() ?:
        emptyList()

    /**
     * The subnet ID of the physical connection requirements of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html#cfn-datazone-connection-physicalconnectionrequirements-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The subnet ID list of the physical connection requirements of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html#cfn-datazone-connection-physicalconnectionrequirements-subnetidlist)
     */
    public fun subnetIdList(): List<String> = unwrap(this).getSubnetIdList() ?: emptyList()

    /**
     * A builder for [PhysicalConnectionRequirementsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The availability zone of the physical connection requirements of a
       * connection.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param securityGroupIdList The group ID list of the physical connection requirements of a
       * connection.
       */
      public fun securityGroupIdList(securityGroupIdList: List<String>)

      /**
       * @param securityGroupIdList The group ID list of the physical connection requirements of a
       * connection.
       */
      public fun securityGroupIdList(vararg securityGroupIdList: String)

      /**
       * @param subnetId The subnet ID of the physical connection requirements of a connection.
       */
      public fun subnetId(subnetId: String)

      /**
       * @param subnetIdList The subnet ID list of the physical connection requirements of a
       * connection.
       */
      public fun subnetIdList(subnetIdList: List<String>)

      /**
       * @param subnetIdList The subnet ID list of the physical connection requirements of a
       * connection.
       */
      public fun subnetIdList(vararg subnetIdList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.PhysicalConnectionRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.PhysicalConnectionRequirementsProperty.builder()

      /**
       * @param availabilityZone The availability zone of the physical connection requirements of a
       * connection.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param securityGroupIdList The group ID list of the physical connection requirements of a
       * connection.
       */
      override fun securityGroupIdList(securityGroupIdList: List<String>) {
        cdkBuilder.securityGroupIdList(securityGroupIdList)
      }

      /**
       * @param securityGroupIdList The group ID list of the physical connection requirements of a
       * connection.
       */
      override fun securityGroupIdList(vararg securityGroupIdList: String): Unit =
          securityGroupIdList(securityGroupIdList.toList())

      /**
       * @param subnetId The subnet ID of the physical connection requirements of a connection.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      /**
       * @param subnetIdList The subnet ID list of the physical connection requirements of a
       * connection.
       */
      override fun subnetIdList(subnetIdList: List<String>) {
        cdkBuilder.subnetIdList(subnetIdList)
      }

      /**
       * @param subnetIdList The subnet ID list of the physical connection requirements of a
       * connection.
       */
      override fun subnetIdList(vararg subnetIdList: String): Unit =
          subnetIdList(subnetIdList.toList())

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.PhysicalConnectionRequirementsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.PhysicalConnectionRequirementsProperty,
    ) : CdkObject(cdkObject),
        PhysicalConnectionRequirementsProperty {
      /**
       * The availability zone of the physical connection requirements of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html#cfn-datazone-connection-physicalconnectionrequirements-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The group ID list of the physical connection requirements of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html#cfn-datazone-connection-physicalconnectionrequirements-securitygroupidlist)
       */
      override fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList() ?:
          emptyList()

      /**
       * The subnet ID of the physical connection requirements of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html#cfn-datazone-connection-physicalconnectionrequirements-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()

      /**
       * The subnet ID list of the physical connection requirements of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-physicalconnectionrequirements.html#cfn-datazone-connection-physicalconnectionrequirements-subnetidlist)
       */
      override fun subnetIdList(): List<String> = unwrap(this).getSubnetIdList() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PhysicalConnectionRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.PhysicalConnectionRequirementsProperty):
          PhysicalConnectionRequirementsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PhysicalConnectionRequirementsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhysicalConnectionRequirementsProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.PhysicalConnectionRequirementsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.PhysicalConnectionRequirementsProperty
    }
  }

  /**
   * Amazon Redshift credentials of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * RedshiftCredentialsProperty redshiftCredentialsProperty = RedshiftCredentialsProperty.builder()
   * .secretArn("secretArn")
   * .usernamePassword(UsernamePasswordProperty.builder()
   * .password("password")
   * .username("username")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftcredentials.html)
   */
  public interface RedshiftCredentialsProperty {
    /**
     * The secret ARN of the Amazon Redshift credentials of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftcredentials.html#cfn-datazone-connection-redshiftcredentials-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * The username and password of the Amazon Redshift credentials of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftcredentials.html#cfn-datazone-connection-redshiftcredentials-usernamepassword)
     */
    public fun usernamePassword(): Any? = unwrap(this).getUsernamePassword()

    /**
     * A builder for [RedshiftCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param secretArn The secret ARN of the Amazon Redshift credentials of a connection.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param usernamePassword The username and password of the Amazon Redshift credentials of a
       * connection.
       */
      public fun usernamePassword(usernamePassword: IResolvable)

      /**
       * @param usernamePassword The username and password of the Amazon Redshift credentials of a
       * connection.
       */
      public fun usernamePassword(usernamePassword: UsernamePasswordProperty)

      /**
       * @param usernamePassword The username and password of the Amazon Redshift credentials of a
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ac9698f799a6c7c2b63b573fda92367d92382753e9617a04460e3d9bcb8b2d6")
      public fun usernamePassword(usernamePassword: UsernamePasswordProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftCredentialsProperty.builder()

      /**
       * @param secretArn The secret ARN of the Amazon Redshift credentials of a connection.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param usernamePassword The username and password of the Amazon Redshift credentials of a
       * connection.
       */
      override fun usernamePassword(usernamePassword: IResolvable) {
        cdkBuilder.usernamePassword(usernamePassword.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param usernamePassword The username and password of the Amazon Redshift credentials of a
       * connection.
       */
      override fun usernamePassword(usernamePassword: UsernamePasswordProperty) {
        cdkBuilder.usernamePassword(usernamePassword.let(UsernamePasswordProperty.Companion::unwrap))
      }

      /**
       * @param usernamePassword The username and password of the Amazon Redshift credentials of a
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ac9698f799a6c7c2b63b573fda92367d92382753e9617a04460e3d9bcb8b2d6")
      override fun usernamePassword(usernamePassword: UsernamePasswordProperty.Builder.() -> Unit):
          Unit = usernamePassword(UsernamePasswordProperty(usernamePassword))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.RedshiftCredentialsProperty,
    ) : CdkObject(cdkObject),
        RedshiftCredentialsProperty {
      /**
       * The secret ARN of the Amazon Redshift credentials of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftcredentials.html#cfn-datazone-connection-redshiftcredentials-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()

      /**
       * The username and password of the Amazon Redshift credentials of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftcredentials.html#cfn-datazone-connection-redshiftcredentials-usernamepassword)
       */
      override fun usernamePassword(): Any? = unwrap(this).getUsernamePassword()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.RedshiftCredentialsProperty):
          RedshiftCredentialsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftCredentialsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftCredentialsProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftCredentialsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftCredentialsProperty
    }
  }

  /**
   * The Amaon Redshift lineage sync configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * RedshiftLineageSyncConfigurationInputProperty redshiftLineageSyncConfigurationInputProperty =
   * RedshiftLineageSyncConfigurationInputProperty.builder()
   * .enabled(false)
   * .schedule(LineageSyncScheduleProperty.builder()
   * .schedule("schedule")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftlineagesyncconfigurationinput.html)
   */
  public interface RedshiftLineageSyncConfigurationInputProperty {
    /**
     * Specifies whether the Amaon Redshift lineage sync configuration is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftlineagesyncconfigurationinput.html#cfn-datazone-connection-redshiftlineagesyncconfigurationinput-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The schedule of the Amaon Redshift lineage sync configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftlineagesyncconfigurationinput.html#cfn-datazone-connection-redshiftlineagesyncconfigurationinput-schedule)
     */
    public fun schedule(): Any? = unwrap(this).getSchedule()

    /**
     * A builder for [RedshiftLineageSyncConfigurationInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specifies whether the Amaon Redshift lineage sync configuration is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether the Amaon Redshift lineage sync configuration is enabled.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param schedule The schedule of the Amaon Redshift lineage sync configuration.
       */
      public fun schedule(schedule: IResolvable)

      /**
       * @param schedule The schedule of the Amaon Redshift lineage sync configuration.
       */
      public fun schedule(schedule: LineageSyncScheduleProperty)

      /**
       * @param schedule The schedule of the Amaon Redshift lineage sync configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbcf2aab09ce035b9c696e7894328cf3480dfa2115e581e58be22d922dc56842")
      public fun schedule(schedule: LineageSyncScheduleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftLineageSyncConfigurationInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftLineageSyncConfigurationInputProperty.builder()

      /**
       * @param enabled Specifies whether the Amaon Redshift lineage sync configuration is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether the Amaon Redshift lineage sync configuration is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param schedule The schedule of the Amaon Redshift lineage sync configuration.
       */
      override fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param schedule The schedule of the Amaon Redshift lineage sync configuration.
       */
      override fun schedule(schedule: LineageSyncScheduleProperty) {
        cdkBuilder.schedule(schedule.let(LineageSyncScheduleProperty.Companion::unwrap))
      }

      /**
       * @param schedule The schedule of the Amaon Redshift lineage sync configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbcf2aab09ce035b9c696e7894328cf3480dfa2115e581e58be22d922dc56842")
      override fun schedule(schedule: LineageSyncScheduleProperty.Builder.() -> Unit): Unit =
          schedule(LineageSyncScheduleProperty(schedule))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftLineageSyncConfigurationInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.RedshiftLineageSyncConfigurationInputProperty,
    ) : CdkObject(cdkObject),
        RedshiftLineageSyncConfigurationInputProperty {
      /**
       * Specifies whether the Amaon Redshift lineage sync configuration is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftlineagesyncconfigurationinput.html#cfn-datazone-connection-redshiftlineagesyncconfigurationinput-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The schedule of the Amaon Redshift lineage sync configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftlineagesyncconfigurationinput.html#cfn-datazone-connection-redshiftlineagesyncconfigurationinput-schedule)
       */
      override fun schedule(): Any? = unwrap(this).getSchedule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftLineageSyncConfigurationInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.RedshiftLineageSyncConfigurationInputProperty):
          RedshiftLineageSyncConfigurationInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftLineageSyncConfigurationInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftLineageSyncConfigurationInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftLineageSyncConfigurationInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftLineageSyncConfigurationInputProperty
    }
  }

  /**
   * The Amazon Redshift properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * RedshiftPropertiesInputProperty redshiftPropertiesInputProperty =
   * RedshiftPropertiesInputProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html)
   */
  public interface RedshiftPropertiesInputProperty {
    /**
     * The Amaon Redshift credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-credentials)
     */
    public fun credentials(): Any? = unwrap(this).getCredentials()

    /**
     * The Amazon Redshift database name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The Amazon Redshift host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-host)
     */
    public fun host(): String? = unwrap(this).getHost()

    /**
     * The lineage sync of the Amazon Redshift.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-lineagesync)
     */
    public fun lineageSync(): Any? = unwrap(this).getLineageSync()

    /**
     * The Amaon Redshift port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The Amazon Redshift storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-storage)
     */
    public fun storage(): Any? = unwrap(this).getStorage()

    /**
     * A builder for [RedshiftPropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credentials The Amaon Redshift credentials.
       */
      public fun credentials(credentials: IResolvable)

      /**
       * @param credentials The Amaon Redshift credentials.
       */
      public fun credentials(credentials: RedshiftCredentialsProperty)

      /**
       * @param credentials The Amaon Redshift credentials.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d047c5c5db3e2c79ffe45554fc9df2a519a93bf0ec4464786ef4dc699a47ea8")
      public fun credentials(credentials: RedshiftCredentialsProperty.Builder.() -> Unit)

      /**
       * @param databaseName The Amazon Redshift database name.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param host The Amazon Redshift host.
       */
      public fun host(host: String)

      /**
       * @param lineageSync The lineage sync of the Amazon Redshift.
       */
      public fun lineageSync(lineageSync: IResolvable)

      /**
       * @param lineageSync The lineage sync of the Amazon Redshift.
       */
      public fun lineageSync(lineageSync: RedshiftLineageSyncConfigurationInputProperty)

      /**
       * @param lineageSync The lineage sync of the Amazon Redshift.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea33f46c7531d6c751116230ba1c366faff65d3e85851e6351939b3ff4e55f14")
      public
          fun lineageSync(lineageSync: RedshiftLineageSyncConfigurationInputProperty.Builder.() -> Unit)

      /**
       * @param port The Amaon Redshift port.
       */
      public fun port(port: Number)

      /**
       * @param storage The Amazon Redshift storage.
       */
      public fun storage(storage: IResolvable)

      /**
       * @param storage The Amazon Redshift storage.
       */
      public fun storage(storage: RedshiftStoragePropertiesProperty)

      /**
       * @param storage The Amazon Redshift storage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42de12b90a6f2f5a8cc0cd2944f3ec275dc536ff7d8c74978b291b4441fd7b70")
      public fun storage(storage: RedshiftStoragePropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftPropertiesInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftPropertiesInputProperty.builder()

      /**
       * @param credentials The Amaon Redshift credentials.
       */
      override fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param credentials The Amaon Redshift credentials.
       */
      override fun credentials(credentials: RedshiftCredentialsProperty) {
        cdkBuilder.credentials(credentials.let(RedshiftCredentialsProperty.Companion::unwrap))
      }

      /**
       * @param credentials The Amaon Redshift credentials.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d047c5c5db3e2c79ffe45554fc9df2a519a93bf0ec4464786ef4dc699a47ea8")
      override fun credentials(credentials: RedshiftCredentialsProperty.Builder.() -> Unit): Unit =
          credentials(RedshiftCredentialsProperty(credentials))

      /**
       * @param databaseName The Amazon Redshift database name.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param host The Amazon Redshift host.
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param lineageSync The lineage sync of the Amazon Redshift.
       */
      override fun lineageSync(lineageSync: IResolvable) {
        cdkBuilder.lineageSync(lineageSync.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lineageSync The lineage sync of the Amazon Redshift.
       */
      override fun lineageSync(lineageSync: RedshiftLineageSyncConfigurationInputProperty) {
        cdkBuilder.lineageSync(lineageSync.let(RedshiftLineageSyncConfigurationInputProperty.Companion::unwrap))
      }

      /**
       * @param lineageSync The lineage sync of the Amazon Redshift.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea33f46c7531d6c751116230ba1c366faff65d3e85851e6351939b3ff4e55f14")
      override
          fun lineageSync(lineageSync: RedshiftLineageSyncConfigurationInputProperty.Builder.() -> Unit):
          Unit = lineageSync(RedshiftLineageSyncConfigurationInputProperty(lineageSync))

      /**
       * @param port The Amaon Redshift port.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param storage The Amazon Redshift storage.
       */
      override fun storage(storage: IResolvable) {
        cdkBuilder.storage(storage.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param storage The Amazon Redshift storage.
       */
      override fun storage(storage: RedshiftStoragePropertiesProperty) {
        cdkBuilder.storage(storage.let(RedshiftStoragePropertiesProperty.Companion::unwrap))
      }

      /**
       * @param storage The Amazon Redshift storage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42de12b90a6f2f5a8cc0cd2944f3ec275dc536ff7d8c74978b291b4441fd7b70")
      override fun storage(storage: RedshiftStoragePropertiesProperty.Builder.() -> Unit): Unit =
          storage(RedshiftStoragePropertiesProperty(storage))

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftPropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.RedshiftPropertiesInputProperty,
    ) : CdkObject(cdkObject),
        RedshiftPropertiesInputProperty {
      /**
       * The Amaon Redshift credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-credentials)
       */
      override fun credentials(): Any? = unwrap(this).getCredentials()

      /**
       * The Amazon Redshift database name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The Amazon Redshift host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-host)
       */
      override fun host(): String? = unwrap(this).getHost()

      /**
       * The lineage sync of the Amazon Redshift.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-lineagesync)
       */
      override fun lineageSync(): Any? = unwrap(this).getLineageSync()

      /**
       * The Amaon Redshift port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The Amazon Redshift storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftpropertiesinput.html#cfn-datazone-connection-redshiftpropertiesinput-storage)
       */
      override fun storage(): Any? = unwrap(this).getStorage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftPropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.RedshiftPropertiesInputProperty):
          RedshiftPropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftPropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftPropertiesInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftPropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftPropertiesInputProperty
    }
  }

  /**
   * The Amazon Redshift storage properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * RedshiftStoragePropertiesProperty redshiftStoragePropertiesProperty =
   * RedshiftStoragePropertiesProperty.builder()
   * .clusterName("clusterName")
   * .workgroupName("workgroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftstorageproperties.html)
   */
  public interface RedshiftStoragePropertiesProperty {
    /**
     * The cluster name in the Amazon Redshift storage properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftstorageproperties.html#cfn-datazone-connection-redshiftstorageproperties-clustername)
     */
    public fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * The workgroup name in the Amazon Redshift storage properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftstorageproperties.html#cfn-datazone-connection-redshiftstorageproperties-workgroupname)
     */
    public fun workgroupName(): String? = unwrap(this).getWorkgroupName()

    /**
     * A builder for [RedshiftStoragePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterName The cluster name in the Amazon Redshift storage properties.
       */
      public fun clusterName(clusterName: String)

      /**
       * @param workgroupName The workgroup name in the Amazon Redshift storage properties.
       */
      public fun workgroupName(workgroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftStoragePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftStoragePropertiesProperty.builder()

      /**
       * @param clusterName The cluster name in the Amazon Redshift storage properties.
       */
      override fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
      }

      /**
       * @param workgroupName The workgroup name in the Amazon Redshift storage properties.
       */
      override fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftStoragePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.RedshiftStoragePropertiesProperty,
    ) : CdkObject(cdkObject),
        RedshiftStoragePropertiesProperty {
      /**
       * The cluster name in the Amazon Redshift storage properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftstorageproperties.html#cfn-datazone-connection-redshiftstorageproperties-clustername)
       */
      override fun clusterName(): String? = unwrap(this).getClusterName()

      /**
       * The workgroup name in the Amazon Redshift storage properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-redshiftstorageproperties.html#cfn-datazone-connection-redshiftstorageproperties-workgroupname)
       */
      override fun workgroupName(): String? = unwrap(this).getWorkgroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RedshiftStoragePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.RedshiftStoragePropertiesProperty):
          RedshiftStoragePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RedshiftStoragePropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftStoragePropertiesProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftStoragePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.RedshiftStoragePropertiesProperty
    }
  }

  /**
   * The Spark EMR properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * SparkEmrPropertiesInputProperty sparkEmrPropertiesInputProperty =
   * SparkEmrPropertiesInputProperty.builder()
   * .computeArn("computeArn")
   * .instanceProfileArn("instanceProfileArn")
   * .javaVirtualEnv("javaVirtualEnv")
   * .logUri("logUri")
   * .pythonVirtualEnv("pythonVirtualEnv")
   * .runtimeRole("runtimeRole")
   * .trustedCertificatesS3Uri("trustedCertificatesS3Uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html)
   */
  public interface SparkEmrPropertiesInputProperty {
    /**
     * The compute ARN of Spark EMR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-computearn)
     */
    public fun computeArn(): String? = unwrap(this).getComputeArn()

    /**
     * The instance profile ARN of Spark EMR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-instanceprofilearn)
     */
    public fun instanceProfileArn(): String? = unwrap(this).getInstanceProfileArn()

    /**
     * The java virtual env of the Spark EMR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-javavirtualenv)
     */
    public fun javaVirtualEnv(): String? = unwrap(this).getJavaVirtualEnv()

    /**
     * The log URI of the Spark EMR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-loguri)
     */
    public fun logUri(): String? = unwrap(this).getLogUri()

    /**
     * The Python virtual env of the Spark EMR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-pythonvirtualenv)
     */
    public fun pythonVirtualEnv(): String? = unwrap(this).getPythonVirtualEnv()

    /**
     * The runtime role of the Spark EMR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-runtimerole)
     */
    public fun runtimeRole(): String? = unwrap(this).getRuntimeRole()

    /**
     * The certificates S3 URI of the Spark EMR.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-trustedcertificatess3uri)
     */
    public fun trustedCertificatesS3Uri(): String? = unwrap(this).getTrustedCertificatesS3Uri()

    /**
     * A builder for [SparkEmrPropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computeArn The compute ARN of Spark EMR.
       */
      public fun computeArn(computeArn: String)

      /**
       * @param instanceProfileArn The instance profile ARN of Spark EMR.
       */
      public fun instanceProfileArn(instanceProfileArn: String)

      /**
       * @param javaVirtualEnv The java virtual env of the Spark EMR.
       */
      public fun javaVirtualEnv(javaVirtualEnv: String)

      /**
       * @param logUri The log URI of the Spark EMR.
       */
      public fun logUri(logUri: String)

      /**
       * @param pythonVirtualEnv The Python virtual env of the Spark EMR.
       */
      public fun pythonVirtualEnv(pythonVirtualEnv: String)

      /**
       * @param runtimeRole The runtime role of the Spark EMR.
       */
      public fun runtimeRole(runtimeRole: String)

      /**
       * @param trustedCertificatesS3Uri The certificates S3 URI of the Spark EMR.
       */
      public fun trustedCertificatesS3Uri(trustedCertificatesS3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.SparkEmrPropertiesInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.SparkEmrPropertiesInputProperty.builder()

      /**
       * @param computeArn The compute ARN of Spark EMR.
       */
      override fun computeArn(computeArn: String) {
        cdkBuilder.computeArn(computeArn)
      }

      /**
       * @param instanceProfileArn The instance profile ARN of Spark EMR.
       */
      override fun instanceProfileArn(instanceProfileArn: String) {
        cdkBuilder.instanceProfileArn(instanceProfileArn)
      }

      /**
       * @param javaVirtualEnv The java virtual env of the Spark EMR.
       */
      override fun javaVirtualEnv(javaVirtualEnv: String) {
        cdkBuilder.javaVirtualEnv(javaVirtualEnv)
      }

      /**
       * @param logUri The log URI of the Spark EMR.
       */
      override fun logUri(logUri: String) {
        cdkBuilder.logUri(logUri)
      }

      /**
       * @param pythonVirtualEnv The Python virtual env of the Spark EMR.
       */
      override fun pythonVirtualEnv(pythonVirtualEnv: String) {
        cdkBuilder.pythonVirtualEnv(pythonVirtualEnv)
      }

      /**
       * @param runtimeRole The runtime role of the Spark EMR.
       */
      override fun runtimeRole(runtimeRole: String) {
        cdkBuilder.runtimeRole(runtimeRole)
      }

      /**
       * @param trustedCertificatesS3Uri The certificates S3 URI of the Spark EMR.
       */
      override fun trustedCertificatesS3Uri(trustedCertificatesS3Uri: String) {
        cdkBuilder.trustedCertificatesS3Uri(trustedCertificatesS3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.SparkEmrPropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.SparkEmrPropertiesInputProperty,
    ) : CdkObject(cdkObject),
        SparkEmrPropertiesInputProperty {
      /**
       * The compute ARN of Spark EMR.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-computearn)
       */
      override fun computeArn(): String? = unwrap(this).getComputeArn()

      /**
       * The instance profile ARN of Spark EMR.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-instanceprofilearn)
       */
      override fun instanceProfileArn(): String? = unwrap(this).getInstanceProfileArn()

      /**
       * The java virtual env of the Spark EMR.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-javavirtualenv)
       */
      override fun javaVirtualEnv(): String? = unwrap(this).getJavaVirtualEnv()

      /**
       * The log URI of the Spark EMR.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-loguri)
       */
      override fun logUri(): String? = unwrap(this).getLogUri()

      /**
       * The Python virtual env of the Spark EMR.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-pythonvirtualenv)
       */
      override fun pythonVirtualEnv(): String? = unwrap(this).getPythonVirtualEnv()

      /**
       * The runtime role of the Spark EMR.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-runtimerole)
       */
      override fun runtimeRole(): String? = unwrap(this).getRuntimeRole()

      /**
       * The certificates S3 URI of the Spark EMR.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkemrpropertiesinput.html#cfn-datazone-connection-sparkemrpropertiesinput-trustedcertificatess3uri)
       */
      override fun trustedCertificatesS3Uri(): String? = unwrap(this).getTrustedCertificatesS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SparkEmrPropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.SparkEmrPropertiesInputProperty):
          SparkEmrPropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SparkEmrPropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SparkEmrPropertiesInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.SparkEmrPropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.SparkEmrPropertiesInputProperty
    }
  }

  /**
   * The Spark AWS Glue args.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * SparkGlueArgsProperty sparkGlueArgsProperty = SparkGlueArgsProperty.builder()
   * .connection("connection")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkglueargs.html)
   */
  public interface SparkGlueArgsProperty {
    /**
     * The connection in the Spark AWS Glue args.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkglueargs.html#cfn-datazone-connection-sparkglueargs-connection)
     */
    public fun connection(): String? = unwrap(this).getConnection()

    /**
     * A builder for [SparkGlueArgsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connection The connection in the Spark AWS Glue args.
       */
      public fun connection(connection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGlueArgsProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGlueArgsProperty.builder()

      /**
       * @param connection The connection in the Spark AWS Glue args.
       */
      override fun connection(connection: String) {
        cdkBuilder.connection(connection)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGlueArgsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.SparkGlueArgsProperty,
    ) : CdkObject(cdkObject),
        SparkGlueArgsProperty {
      /**
       * The connection in the Spark AWS Glue args.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkglueargs.html#cfn-datazone-connection-sparkglueargs-connection)
       */
      override fun connection(): String? = unwrap(this).getConnection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SparkGlueArgsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.SparkGlueArgsProperty):
          SparkGlueArgsProperty = CdkObjectWrappers.wrap(cdkObject) as? SparkGlueArgsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SparkGlueArgsProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGlueArgsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGlueArgsProperty
    }
  }

  /**
   * The Spark AWS Glue properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * SparkGluePropertiesInputProperty sparkGluePropertiesInputProperty =
   * SparkGluePropertiesInputProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html)
   */
  public interface SparkGluePropertiesInputProperty {
    /**
     * The additional args in the Spark AWS Glue properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-additionalargs)
     */
    public fun additionalArgs(): Any? = unwrap(this).getAdditionalArgs()

    /**
     * The AWS Glue connection name in the Spark AWS Glue properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-glueconnectionname)
     */
    public fun glueConnectionName(): String? = unwrap(this).getGlueConnectionName()

    /**
     * The AWS Glue version in the Spark AWS Glue properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-glueversion)
     */
    public fun glueVersion(): String? = unwrap(this).getGlueVersion()

    /**
     * The idle timeout in the Spark AWS Glue properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-idletimeout)
     */
    public fun idleTimeout(): Number? = unwrap(this).getIdleTimeout()

    /**
     * The Java virtual env in the Spark AWS Glue properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-javavirtualenv)
     */
    public fun javaVirtualEnv(): String? = unwrap(this).getJavaVirtualEnv()

    /**
     * The number of workers in the Spark AWS Glue properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-numberofworkers)
     */
    public fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

    /**
     * The Python virtual env in the Spark AWS Glue properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-pythonvirtualenv)
     */
    public fun pythonVirtualEnv(): String? = unwrap(this).getPythonVirtualEnv()

    /**
     * The worker type in the Spark AWS Glue properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-workertype)
     */
    public fun workerType(): String? = unwrap(this).getWorkerType()

    /**
     * A builder for [SparkGluePropertiesInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalArgs The additional args in the Spark AWS Glue properties.
       */
      public fun additionalArgs(additionalArgs: IResolvable)

      /**
       * @param additionalArgs The additional args in the Spark AWS Glue properties.
       */
      public fun additionalArgs(additionalArgs: SparkGlueArgsProperty)

      /**
       * @param additionalArgs The additional args in the Spark AWS Glue properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297514ad7ba1fdf85c3c37004b77af1796f16791e79928fede1c2f812122a8e2")
      public fun additionalArgs(additionalArgs: SparkGlueArgsProperty.Builder.() -> Unit)

      /**
       * @param glueConnectionName The AWS Glue connection name in the Spark AWS Glue properties.
       */
      public fun glueConnectionName(glueConnectionName: String)

      /**
       * @param glueVersion The AWS Glue version in the Spark AWS Glue properties.
       */
      public fun glueVersion(glueVersion: String)

      /**
       * @param idleTimeout The idle timeout in the Spark AWS Glue properties.
       */
      public fun idleTimeout(idleTimeout: Number)

      /**
       * @param javaVirtualEnv The Java virtual env in the Spark AWS Glue properties.
       */
      public fun javaVirtualEnv(javaVirtualEnv: String)

      /**
       * @param numberOfWorkers The number of workers in the Spark AWS Glue properties.
       */
      public fun numberOfWorkers(numberOfWorkers: Number)

      /**
       * @param pythonVirtualEnv The Python virtual env in the Spark AWS Glue properties.
       */
      public fun pythonVirtualEnv(pythonVirtualEnv: String)

      /**
       * @param workerType The worker type in the Spark AWS Glue properties.
       */
      public fun workerType(workerType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGluePropertiesInputProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGluePropertiesInputProperty.builder()

      /**
       * @param additionalArgs The additional args in the Spark AWS Glue properties.
       */
      override fun additionalArgs(additionalArgs: IResolvable) {
        cdkBuilder.additionalArgs(additionalArgs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param additionalArgs The additional args in the Spark AWS Glue properties.
       */
      override fun additionalArgs(additionalArgs: SparkGlueArgsProperty) {
        cdkBuilder.additionalArgs(additionalArgs.let(SparkGlueArgsProperty.Companion::unwrap))
      }

      /**
       * @param additionalArgs The additional args in the Spark AWS Glue properties.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("297514ad7ba1fdf85c3c37004b77af1796f16791e79928fede1c2f812122a8e2")
      override fun additionalArgs(additionalArgs: SparkGlueArgsProperty.Builder.() -> Unit): Unit =
          additionalArgs(SparkGlueArgsProperty(additionalArgs))

      /**
       * @param glueConnectionName The AWS Glue connection name in the Spark AWS Glue properties.
       */
      override fun glueConnectionName(glueConnectionName: String) {
        cdkBuilder.glueConnectionName(glueConnectionName)
      }

      /**
       * @param glueVersion The AWS Glue version in the Spark AWS Glue properties.
       */
      override fun glueVersion(glueVersion: String) {
        cdkBuilder.glueVersion(glueVersion)
      }

      /**
       * @param idleTimeout The idle timeout in the Spark AWS Glue properties.
       */
      override fun idleTimeout(idleTimeout: Number) {
        cdkBuilder.idleTimeout(idleTimeout)
      }

      /**
       * @param javaVirtualEnv The Java virtual env in the Spark AWS Glue properties.
       */
      override fun javaVirtualEnv(javaVirtualEnv: String) {
        cdkBuilder.javaVirtualEnv(javaVirtualEnv)
      }

      /**
       * @param numberOfWorkers The number of workers in the Spark AWS Glue properties.
       */
      override fun numberOfWorkers(numberOfWorkers: Number) {
        cdkBuilder.numberOfWorkers(numberOfWorkers)
      }

      /**
       * @param pythonVirtualEnv The Python virtual env in the Spark AWS Glue properties.
       */
      override fun pythonVirtualEnv(pythonVirtualEnv: String) {
        cdkBuilder.pythonVirtualEnv(pythonVirtualEnv)
      }

      /**
       * @param workerType The worker type in the Spark AWS Glue properties.
       */
      override fun workerType(workerType: String) {
        cdkBuilder.workerType(workerType)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGluePropertiesInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.SparkGluePropertiesInputProperty,
    ) : CdkObject(cdkObject),
        SparkGluePropertiesInputProperty {
      /**
       * The additional args in the Spark AWS Glue properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-additionalargs)
       */
      override fun additionalArgs(): Any? = unwrap(this).getAdditionalArgs()

      /**
       * The AWS Glue connection name in the Spark AWS Glue properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-glueconnectionname)
       */
      override fun glueConnectionName(): String? = unwrap(this).getGlueConnectionName()

      /**
       * The AWS Glue version in the Spark AWS Glue properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-glueversion)
       */
      override fun glueVersion(): String? = unwrap(this).getGlueVersion()

      /**
       * The idle timeout in the Spark AWS Glue properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-idletimeout)
       */
      override fun idleTimeout(): Number? = unwrap(this).getIdleTimeout()

      /**
       * The Java virtual env in the Spark AWS Glue properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-javavirtualenv)
       */
      override fun javaVirtualEnv(): String? = unwrap(this).getJavaVirtualEnv()

      /**
       * The number of workers in the Spark AWS Glue properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-numberofworkers)
       */
      override fun numberOfWorkers(): Number? = unwrap(this).getNumberOfWorkers()

      /**
       * The Python virtual env in the Spark AWS Glue properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-pythonvirtualenv)
       */
      override fun pythonVirtualEnv(): String? = unwrap(this).getPythonVirtualEnv()

      /**
       * The worker type in the Spark AWS Glue properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-sparkgluepropertiesinput.html#cfn-datazone-connection-sparkgluepropertiesinput-workertype)
       */
      override fun workerType(): String? = unwrap(this).getWorkerType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SparkGluePropertiesInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.SparkGluePropertiesInputProperty):
          SparkGluePropertiesInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SparkGluePropertiesInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SparkGluePropertiesInputProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGluePropertiesInputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.SparkGluePropertiesInputProperty
    }
  }

  /**
   * The username and password of a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * UsernamePasswordProperty usernamePasswordProperty = UsernamePasswordProperty.builder()
   * .password("password")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-usernamepassword.html)
   */
  public interface UsernamePasswordProperty {
    /**
     * The password of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-usernamepassword.html#cfn-datazone-connection-usernamepassword-password)
     */
    public fun password(): String

    /**
     * The username of a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-usernamepassword.html#cfn-datazone-connection-usernamepassword-username)
     */
    public fun username(): String

    /**
     * A builder for [UsernamePasswordProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password The password of a connection. 
       */
      public fun password(password: String)

      /**
       * @param username The username of a connection. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnConnection.UsernamePasswordProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnConnection.UsernamePasswordProperty.builder()

      /**
       * @param password The password of a connection. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username The username of a connection. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnConnection.UsernamePasswordProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.UsernamePasswordProperty,
    ) : CdkObject(cdkObject),
        UsernamePasswordProperty {
      /**
       * The password of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-usernamepassword.html#cfn-datazone-connection-usernamepassword-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * The username of a connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-connection-usernamepassword.html#cfn-datazone-connection-usernamepassword-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UsernamePasswordProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnConnection.UsernamePasswordProperty):
          UsernamePasswordProperty = CdkObjectWrappers.wrap(cdkObject) as? UsernamePasswordProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UsernamePasswordProperty):
          software.amazon.awscdk.services.datazone.CfnConnection.UsernamePasswordProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnConnection.UsernamePasswordProperty
    }
  }
}
