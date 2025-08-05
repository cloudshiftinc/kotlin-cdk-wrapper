@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.systemsmanagersap

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An SAP application registered with AWS Systems Manager for SAP.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.systemsmanagersap.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .applicationId("applicationId")
 * .applicationType("applicationType")
 * // the properties below are optional
 * .componentsInfo(List.of(ComponentInfoProperty.builder()
 * .componentType("componentType")
 * .ec2InstanceId("ec2InstanceId")
 * .sid("sid")
 * .build()))
 * .credentials(List.of(CredentialProperty.builder()
 * .credentialType("credentialType")
 * .databaseName("databaseName")
 * .secretId("secretId")
 * .build()))
 * .databaseArn("databaseArn")
 * .instances(List.of("instances"))
 * .sapInstanceNumber("sapInstanceNumber")
 * .sid("sid")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.systemsmanagersap.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * The ID of the application.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The ID of the application.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The type of the application.
   */
  public open fun applicationType(): String = unwrap(this).getApplicationType()

  /**
   * The type of the application.
   */
  public open fun applicationType(`value`: String) {
    unwrap(this).setApplicationType(`value`)
  }

  /**
   * The Amazon Resource Name of the SAP application.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * This is an optional parameter for component details to which the SAP ABAP application is
   * attached, such as Web Dispatcher.
   */
  public open fun componentsInfo(): Any? = unwrap(this).getComponentsInfo()

  /**
   * This is an optional parameter for component details to which the SAP ABAP application is
   * attached, such as Web Dispatcher.
   */
  public open fun componentsInfo(`value`: IResolvable) {
    unwrap(this).setComponentsInfo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * This is an optional parameter for component details to which the SAP ABAP application is
   * attached, such as Web Dispatcher.
   */
  public open fun componentsInfo(`value`: List<Any>) {
    unwrap(this).setComponentsInfo(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * This is an optional parameter for component details to which the SAP ABAP application is
   * attached, such as Web Dispatcher.
   */
  public open fun componentsInfo(vararg `value`: Any): Unit = componentsInfo(`value`.toList())

  /**
   * The credentials of the SAP application.
   */
  public open fun credentials(): Any? = unwrap(this).getCredentials()

  /**
   * The credentials of the SAP application.
   */
  public open fun credentials(`value`: IResolvable) {
    unwrap(this).setCredentials(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The credentials of the SAP application.
   */
  public open fun credentials(`value`: List<Any>) {
    unwrap(this).setCredentials(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The credentials of the SAP application.
   */
  public open fun credentials(vararg `value`: Any): Unit = credentials(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the database.
   */
  public open fun databaseArn(): String? = unwrap(this).getDatabaseArn()

  /**
   * The Amazon Resource Name (ARN) of the database.
   */
  public open fun databaseArn(`value`: String) {
    unwrap(this).setDatabaseArn(`value`)
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
   * The Amazon EC2 instances on which your SAP application is running.
   */
  public open fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

  /**
   * The Amazon EC2 instances on which your SAP application is running.
   */
  public open fun instances(`value`: List<String>) {
    unwrap(this).setInstances(`value`)
  }

  /**
   * The Amazon EC2 instances on which your SAP application is running.
   */
  public open fun instances(vararg `value`: String): Unit = instances(`value`.toList())

  /**
   * The SAP instance number of the application.
   */
  public open fun sapInstanceNumber(): String? = unwrap(this).getSapInstanceNumber()

  /**
   * The SAP instance number of the application.
   */
  public open fun sapInstanceNumber(`value`: String) {
    unwrap(this).setSapInstanceNumber(`value`)
  }

  /**
   * The System ID of the application.
   */
  public open fun sid(): String? = unwrap(this).getSid()

  /**
   * The System ID of the application.
   */
  public open fun sid(`value`: String) {
    unwrap(this).setSid(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags on the application.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags on the application.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags on the application.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.systemsmanagersap.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationid)
     * @param applicationId The ID of the application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The type of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationtype)
     * @param applicationType The type of the application. 
     */
    public fun applicationType(applicationType: String)

    /**
     * This is an optional parameter for component details to which the SAP ABAP application is
     * attached, such as Web Dispatcher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-componentsinfo)
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher. 
     */
    public fun componentsInfo(componentsInfo: IResolvable)

    /**
     * This is an optional parameter for component details to which the SAP ABAP application is
     * attached, such as Web Dispatcher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-componentsinfo)
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher. 
     */
    public fun componentsInfo(componentsInfo: List<Any>)

    /**
     * This is an optional parameter for component details to which the SAP ABAP application is
     * attached, such as Web Dispatcher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-componentsinfo)
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher. 
     */
    public fun componentsInfo(vararg componentsInfo: Any)

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     * @param credentials The credentials of the SAP application. 
     */
    public fun credentials(credentials: IResolvable)

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     * @param credentials The credentials of the SAP application. 
     */
    public fun credentials(credentials: List<Any>)

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     * @param credentials The credentials of the SAP application. 
     */
    public fun credentials(vararg credentials: Any)

    /**
     * The Amazon Resource Name (ARN) of the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-databasearn)
     * @param databaseArn The Amazon Resource Name (ARN) of the database. 
     */
    public fun databaseArn(databaseArn: String)

    /**
     * The Amazon EC2 instances on which your SAP application is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-instances)
     * @param instances The Amazon EC2 instances on which your SAP application is running. 
     */
    public fun instances(instances: List<String>)

    /**
     * The Amazon EC2 instances on which your SAP application is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-instances)
     * @param instances The Amazon EC2 instances on which your SAP application is running. 
     */
    public fun instances(vararg instances: String)

    /**
     * The SAP instance number of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sapinstancenumber)
     * @param sapInstanceNumber The SAP instance number of the application. 
     */
    public fun sapInstanceNumber(sapInstanceNumber: String)

    /**
     * The System ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sid)
     * @param sid The System ID of the application. 
     */
    public fun sid(sid: String)

    /**
     * The tags on the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-tags)
     * @param tags The tags on the application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags on the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-tags)
     * @param tags The tags on the application. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.systemsmanagersap.CfnApplication.Builder
        = software.amazon.awscdk.services.systemsmanagersap.CfnApplication.Builder.create(scope, id)

    /**
     * The ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationid)
     * @param applicationId The ID of the application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The type of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-applicationtype)
     * @param applicationType The type of the application. 
     */
    override fun applicationType(applicationType: String) {
      cdkBuilder.applicationType(applicationType)
    }

    /**
     * This is an optional parameter for component details to which the SAP ABAP application is
     * attached, such as Web Dispatcher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-componentsinfo)
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher. 
     */
    override fun componentsInfo(componentsInfo: IResolvable) {
      cdkBuilder.componentsInfo(componentsInfo.let(IResolvable.Companion::unwrap))
    }

    /**
     * This is an optional parameter for component details to which the SAP ABAP application is
     * attached, such as Web Dispatcher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-componentsinfo)
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher. 
     */
    override fun componentsInfo(componentsInfo: List<Any>) {
      cdkBuilder.componentsInfo(componentsInfo.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * This is an optional parameter for component details to which the SAP ABAP application is
     * attached, such as Web Dispatcher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-componentsinfo)
     * @param componentsInfo This is an optional parameter for component details to which the SAP
     * ABAP application is attached, such as Web Dispatcher. 
     */
    override fun componentsInfo(vararg componentsInfo: Any): Unit =
        componentsInfo(componentsInfo.toList())

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     * @param credentials The credentials of the SAP application. 
     */
    override fun credentials(credentials: IResolvable) {
      cdkBuilder.credentials(credentials.let(IResolvable.Companion::unwrap))
    }

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     * @param credentials The credentials of the SAP application. 
     */
    override fun credentials(credentials: List<Any>) {
      cdkBuilder.credentials(credentials.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-credentials)
     * @param credentials The credentials of the SAP application. 
     */
    override fun credentials(vararg credentials: Any): Unit = credentials(credentials.toList())

    /**
     * The Amazon Resource Name (ARN) of the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-databasearn)
     * @param databaseArn The Amazon Resource Name (ARN) of the database. 
     */
    override fun databaseArn(databaseArn: String) {
      cdkBuilder.databaseArn(databaseArn)
    }

    /**
     * The Amazon EC2 instances on which your SAP application is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-instances)
     * @param instances The Amazon EC2 instances on which your SAP application is running. 
     */
    override fun instances(instances: List<String>) {
      cdkBuilder.instances(instances)
    }

    /**
     * The Amazon EC2 instances on which your SAP application is running.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-instances)
     * @param instances The Amazon EC2 instances on which your SAP application is running. 
     */
    override fun instances(vararg instances: String): Unit = instances(instances.toList())

    /**
     * The SAP instance number of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sapinstancenumber)
     * @param sapInstanceNumber The SAP instance number of the application. 
     */
    override fun sapInstanceNumber(sapInstanceNumber: String) {
      cdkBuilder.sapInstanceNumber(sapInstanceNumber)
    }

    /**
     * The System ID of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-sid)
     * @param sid The System ID of the application. 
     */
    override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    /**
     * The tags on the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-tags)
     * @param tags The tags on the application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags on the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-systemsmanagersap-application.html#cfn-systemsmanagersap-application-tags)
     * @param tags The tags on the application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.systemsmanagersap.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.systemsmanagersap.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.systemsmanagersap.CfnApplication
  }

  /**
   * This is information about the component of your SAP application, such as Web Dispatcher.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.systemsmanagersap.*;
   * ComponentInfoProperty componentInfoProperty = ComponentInfoProperty.builder()
   * .componentType("componentType")
   * .ec2InstanceId("ec2InstanceId")
   * .sid("sid")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-componentinfo.html)
   */
  public interface ComponentInfoProperty {
    /**
     * This string is the type of the component.
     *
     * Accepted value is `WD` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-componentinfo.html#cfn-systemsmanagersap-application-componentinfo-componenttype)
     */
    public fun componentType(): String? = unwrap(this).getComponentType()

    /**
     * This is the Amazon EC2 instance on which your SAP component is running.
     *
     * Accepted values are alphanumeric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-componentinfo.html#cfn-systemsmanagersap-application-componentinfo-ec2instanceid)
     */
    public fun ec2InstanceId(): String? = unwrap(this).getEc2InstanceId()

    /**
     * This string is the SAP System ID of the component.
     *
     * Accepted values are alphanumeric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-componentinfo.html#cfn-systemsmanagersap-application-componentinfo-sid)
     */
    public fun sid(): String? = unwrap(this).getSid()

    /**
     * A builder for [ComponentInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param componentType This string is the type of the component.
       * Accepted value is `WD` .
       */
      public fun componentType(componentType: String)

      /**
       * @param ec2InstanceId This is the Amazon EC2 instance on which your SAP component is
       * running.
       * Accepted values are alphanumeric.
       */
      public fun ec2InstanceId(ec2InstanceId: String)

      /**
       * @param sid This string is the SAP System ID of the component.
       * Accepted values are alphanumeric.
       */
      public fun sid(sid: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.ComponentInfoProperty.Builder
          =
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.ComponentInfoProperty.builder()

      /**
       * @param componentType This string is the type of the component.
       * Accepted value is `WD` .
       */
      override fun componentType(componentType: String) {
        cdkBuilder.componentType(componentType)
      }

      /**
       * @param ec2InstanceId This is the Amazon EC2 instance on which your SAP component is
       * running.
       * Accepted values are alphanumeric.
       */
      override fun ec2InstanceId(ec2InstanceId: String) {
        cdkBuilder.ec2InstanceId(ec2InstanceId)
      }

      /**
       * @param sid This string is the SAP System ID of the component.
       * Accepted values are alphanumeric.
       */
      override fun sid(sid: String) {
        cdkBuilder.sid(sid)
      }

      public fun build():
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.ComponentInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication.ComponentInfoProperty,
    ) : CdkObject(cdkObject),
        ComponentInfoProperty {
      /**
       * This string is the type of the component.
       *
       * Accepted value is `WD` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-componentinfo.html#cfn-systemsmanagersap-application-componentinfo-componenttype)
       */
      override fun componentType(): String? = unwrap(this).getComponentType()

      /**
       * This is the Amazon EC2 instance on which your SAP component is running.
       *
       * Accepted values are alphanumeric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-componentinfo.html#cfn-systemsmanagersap-application-componentinfo-ec2instanceid)
       */
      override fun ec2InstanceId(): String? = unwrap(this).getEc2InstanceId()

      /**
       * This string is the SAP System ID of the component.
       *
       * Accepted values are alphanumeric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-componentinfo.html#cfn-systemsmanagersap-application-componentinfo-sid)
       */
      override fun sid(): String? = unwrap(this).getSid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication.ComponentInfoProperty):
          ComponentInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? ComponentInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentInfoProperty):
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.ComponentInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.ComponentInfoProperty
    }
  }

  /**
   * The credentials of your SAP application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.systemsmanagersap.*;
   * CredentialProperty credentialProperty = CredentialProperty.builder()
   * .credentialType("credentialType")
   * .databaseName("databaseName")
   * .secretId("secretId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html)
   */
  public interface CredentialProperty {
    /**
     * The type of the application credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html#cfn-systemsmanagersap-application-credential-credentialtype)
     */
    public fun credentialType(): String? = unwrap(this).getCredentialType()

    /**
     * The name of the SAP HANA database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html#cfn-systemsmanagersap-application-credential-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The secret ID created in AWS Secrets Manager to store the credentials of the SAP application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html#cfn-systemsmanagersap-application-credential-secretid)
     */
    public fun secretId(): String? = unwrap(this).getSecretId()

    /**
     * A builder for [CredentialProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credentialType The type of the application credentials.
       */
      public fun credentialType(credentialType: String)

      /**
       * @param databaseName The name of the SAP HANA database.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param secretId The secret ID created in AWS Secrets Manager to store the credentials of
       * the SAP application.
       */
      public fun secretId(secretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty.Builder
          =
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty.builder()

      /**
       * @param credentialType The type of the application credentials.
       */
      override fun credentialType(credentialType: String) {
        cdkBuilder.credentialType(credentialType)
      }

      /**
       * @param databaseName The name of the SAP HANA database.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param secretId The secret ID created in AWS Secrets Manager to store the credentials of
       * the SAP application.
       */
      override fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
      }

      public fun build():
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty,
    ) : CdkObject(cdkObject),
        CredentialProperty {
      /**
       * The type of the application credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html#cfn-systemsmanagersap-application-credential-credentialtype)
       */
      override fun credentialType(): String? = unwrap(this).getCredentialType()

      /**
       * The name of the SAP HANA database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html#cfn-systemsmanagersap-application-credential-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The secret ID created in AWS Secrets Manager to store the credentials of the SAP
       * application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-systemsmanagersap-application-credential.html#cfn-systemsmanagersap-application-credential-secretid)
       */
      override fun secretId(): String? = unwrap(this).getSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CredentialProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty):
          CredentialProperty = CdkObjectWrappers.wrap(cdkObject) as? CredentialProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CredentialProperty):
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.systemsmanagersap.CfnApplication.CredentialProperty
    }
  }
}
