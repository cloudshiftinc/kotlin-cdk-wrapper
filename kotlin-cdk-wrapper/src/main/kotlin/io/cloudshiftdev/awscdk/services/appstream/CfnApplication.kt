@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This resource creates an application.
 *
 * Applications store the details about how to launch applications on streaming instances. This is
 * only supported for Elastic fleets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .appBlockArn("appBlockArn")
 * .iconS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .build())
 * .instanceFamilies(List.of("instanceFamilies"))
 * .launchPath("launchPath")
 * .name("name")
 * .platforms(List.of("platforms"))
 * // the properties below are optional
 * .attributesToDelete(List.of("attributesToDelete"))
 * .description("description")
 * .displayName("displayName")
 * .launchParameters("launchParameters")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html)
 */
public open class CfnApplication internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The app block ARN with which the application should be associated.
   */
  public open fun appBlockArn(): String = unwrap(this).getAppBlockArn()

  /**
   * The app block ARN with which the application should be associated.
   */
  public open fun appBlockArn(`value`: String) {
    unwrap(this).setAppBlockArn(`value`)
  }

  /**
   * The ARN of the application.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time when the application was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * A list of attributes to delete from an application.
   */
  public open fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
      emptyList()

  /**
   * A list of attributes to delete from an application.
   */
  public open fun attributesToDelete(`value`: List<String>) {
    unwrap(this).setAttributesToDelete(`value`)
  }

  /**
   * A list of attributes to delete from an application.
   */
  public open fun attributesToDelete(vararg `value`: String): Unit =
      attributesToDelete(`value`.toList())

  /**
   * The description of the application.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the application.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the application.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of the application.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The icon S3 location of the application.
   */
  public open fun iconS3Location(): Any = unwrap(this).getIconS3Location()

  /**
   * The icon S3 location of the application.
   */
  public open fun iconS3Location(`value`: IResolvable) {
    unwrap(this).setIconS3Location(`value`.let(IResolvable::unwrap))
  }

  /**
   * The icon S3 location of the application.
   */
  public open fun iconS3Location(`value`: S3LocationProperty) {
    unwrap(this).setIconS3Location(`value`.let(S3LocationProperty::unwrap))
  }

  /**
   * The icon S3 location of the application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("66f0fd809bf210dd34bc4bf6af499cd69bb6aea3db4ceef275b43565aebbcf1b")
  public open fun iconS3Location(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      iconS3Location(S3LocationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The instance families the application supports.
   */
  public open fun instanceFamilies(): List<String> = unwrap(this).getInstanceFamilies()

  /**
   * The instance families the application supports.
   */
  public open fun instanceFamilies(`value`: List<String>) {
    unwrap(this).setInstanceFamilies(`value`)
  }

  /**
   * The instance families the application supports.
   */
  public open fun instanceFamilies(vararg `value`: String): Unit =
      instanceFamilies(`value`.toList())

  /**
   * The launch parameters of the application.
   */
  public open fun launchParameters(): String? = unwrap(this).getLaunchParameters()

  /**
   * The launch parameters of the application.
   */
  public open fun launchParameters(`value`: String) {
    unwrap(this).setLaunchParameters(`value`)
  }

  /**
   * The launch path of the application.
   */
  public open fun launchPath(): String = unwrap(this).getLaunchPath()

  /**
   * The launch path of the application.
   */
  public open fun launchPath(`value`: String) {
    unwrap(this).setLaunchPath(`value`)
  }

  /**
   * The name of the application.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The platforms the application supports.
   */
  public open fun platforms(): List<String> = unwrap(this).getPlatforms()

  /**
   * The platforms the application supports.
   */
  public open fun platforms(`value`: List<String>) {
    unwrap(this).setPlatforms(`value`)
  }

  /**
   * The platforms the application supports.
   */
  public open fun platforms(vararg `value`: String): Unit = platforms(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of the application.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags of the application.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags of the application.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The working directory of the application.
   */
  public open fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * The working directory of the application.
   */
  public open fun workingDirectory(`value`: String) {
    unwrap(this).setWorkingDirectory(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The app block ARN with which the application should be associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-appblockarn)
     * @param appBlockArn The app block ARN with which the application should be associated. 
     */
    public fun appBlockArn(appBlockArn: String)

    /**
     * A list of attributes to delete from an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-attributestodelete)
     * @param attributesToDelete A list of attributes to delete from an application. 
     */
    public fun attributesToDelete(attributesToDelete: List<String>)

    /**
     * A list of attributes to delete from an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-attributestodelete)
     * @param attributesToDelete A list of attributes to delete from an application. 
     */
    public fun attributesToDelete(vararg attributesToDelete: String)

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-description)
     * @param description The description of the application. 
     */
    public fun description(description: String)

    /**
     * The display name of the application.
     *
     * This name is visible to users in the application catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-displayname)
     * @param displayName The display name of the application. 
     */
    public fun displayName(displayName: String)

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     * @param iconS3Location The icon S3 location of the application. 
     */
    public fun iconS3Location(iconS3Location: IResolvable)

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     * @param iconS3Location The icon S3 location of the application. 
     */
    public fun iconS3Location(iconS3Location: S3LocationProperty)

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     * @param iconS3Location The icon S3 location of the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46379a305c52b05d35309e241b62804bb95cefc712794ec6cb674c528ace3ce1")
    public fun iconS3Location(iconS3Location: S3LocationProperty.Builder.() -> Unit)

    /**
     * The instance families the application supports.
     *
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-instancefamilies)
     * @param instanceFamilies The instance families the application supports. 
     */
    public fun instanceFamilies(instanceFamilies: List<String>)

    /**
     * The instance families the application supports.
     *
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-instancefamilies)
     * @param instanceFamilies The instance families the application supports. 
     */
    public fun instanceFamilies(vararg instanceFamilies: String)

    /**
     * The launch parameters of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchparameters)
     * @param launchParameters The launch parameters of the application. 
     */
    public fun launchParameters(launchParameters: String)

    /**
     * The launch path of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchpath)
     * @param launchPath The launch path of the application. 
     */
    public fun launchPath(launchPath: String)

    /**
     * The name of the application.
     *
     * This name is visible to users when a name is not specified in the DisplayName property.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-name)
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * The platforms the application supports.
     *
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-platforms)
     * @param platforms The platforms the application supports. 
     */
    public fun platforms(platforms: List<String>)

    /**
     * The platforms the application supports.
     *
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-platforms)
     * @param platforms The platforms the application supports. 
     */
    public fun platforms(vararg platforms: String)

    /**
     * The tags of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-tags)
     * @param tags The tags of the application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-tags)
     * @param tags The tags of the application. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The working directory of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-workingdirectory)
     * @param workingDirectory The working directory of the application. 
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnApplication.Builder =
        software.amazon.awscdk.services.appstream.CfnApplication.Builder.create(scope, id)

    /**
     * The app block ARN with which the application should be associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-appblockarn)
     * @param appBlockArn The app block ARN with which the application should be associated. 
     */
    override fun appBlockArn(appBlockArn: String) {
      cdkBuilder.appBlockArn(appBlockArn)
    }

    /**
     * A list of attributes to delete from an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-attributestodelete)
     * @param attributesToDelete A list of attributes to delete from an application. 
     */
    override fun attributesToDelete(attributesToDelete: List<String>) {
      cdkBuilder.attributesToDelete(attributesToDelete)
    }

    /**
     * A list of attributes to delete from an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-attributestodelete)
     * @param attributesToDelete A list of attributes to delete from an application. 
     */
    override fun attributesToDelete(vararg attributesToDelete: String): Unit =
        attributesToDelete(attributesToDelete.toList())

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-description)
     * @param description The description of the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the application.
     *
     * This name is visible to users in the application catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-displayname)
     * @param displayName The display name of the application. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     * @param iconS3Location The icon S3 location of the application. 
     */
    override fun iconS3Location(iconS3Location: IResolvable) {
      cdkBuilder.iconS3Location(iconS3Location.let(IResolvable::unwrap))
    }

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     * @param iconS3Location The icon S3 location of the application. 
     */
    override fun iconS3Location(iconS3Location: S3LocationProperty) {
      cdkBuilder.iconS3Location(iconS3Location.let(S3LocationProperty::unwrap))
    }

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     * @param iconS3Location The icon S3 location of the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46379a305c52b05d35309e241b62804bb95cefc712794ec6cb674c528ace3ce1")
    override fun iconS3Location(iconS3Location: S3LocationProperty.Builder.() -> Unit): Unit =
        iconS3Location(S3LocationProperty(iconS3Location))

    /**
     * The instance families the application supports.
     *
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-instancefamilies)
     * @param instanceFamilies The instance families the application supports. 
     */
    override fun instanceFamilies(instanceFamilies: List<String>) {
      cdkBuilder.instanceFamilies(instanceFamilies)
    }

    /**
     * The instance families the application supports.
     *
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-instancefamilies)
     * @param instanceFamilies The instance families the application supports. 
     */
    override fun instanceFamilies(vararg instanceFamilies: String): Unit =
        instanceFamilies(instanceFamilies.toList())

    /**
     * The launch parameters of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchparameters)
     * @param launchParameters The launch parameters of the application. 
     */
    override fun launchParameters(launchParameters: String) {
      cdkBuilder.launchParameters(launchParameters)
    }

    /**
     * The launch path of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchpath)
     * @param launchPath The launch path of the application. 
     */
    override fun launchPath(launchPath: String) {
      cdkBuilder.launchPath(launchPath)
    }

    /**
     * The name of the application.
     *
     * This name is visible to users when a name is not specified in the DisplayName property.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-name)
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The platforms the application supports.
     *
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-platforms)
     * @param platforms The platforms the application supports. 
     */
    override fun platforms(platforms: List<String>) {
      cdkBuilder.platforms(platforms)
    }

    /**
     * The platforms the application supports.
     *
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-platforms)
     * @param platforms The platforms the application supports. 
     */
    override fun platforms(vararg platforms: String): Unit = platforms(platforms.toList())

    /**
     * The tags of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-tags)
     * @param tags The tags of the application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-tags)
     * @param tags The tags of the application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The working directory of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-workingdirectory)
     * @param workingDirectory The working directory of the application. 
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.appstream.CfnApplication = wrapped.cdkObject
  }

  /**
   * The S3 location of the application icon.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .s3Bucket("s3Bucket")
   * .s3Key("s3Key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-application-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The S3 bucket of the S3 object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-application-s3location.html#cfn-appstream-application-s3location-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The S3 key of the S3 object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-application-s3location.html#cfn-appstream-application-s3location-s3key)
     */
    public fun s3Key(): String

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket The S3 bucket of the S3 object. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The S3 key of the S3 object. 
       */
      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty.builder()

      /**
       * @param s3Bucket The S3 bucket of the S3 object. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The S3 key of the S3 object. 
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty,
    ) : CdkObject(cdkObject), S3LocationProperty {
      /**
       * The S3 bucket of the S3 object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-application-s3location.html#cfn-appstream-application-s3location-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The S3 key of the S3 object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-application-s3location.html#cfn-appstream-application-s3location-s3key)
       */
      override fun s3Key(): String = unwrap(this).getS3Key()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty
    }
  }
}
