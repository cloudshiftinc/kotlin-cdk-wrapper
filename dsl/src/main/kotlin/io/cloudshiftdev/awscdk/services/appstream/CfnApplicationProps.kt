package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  /**
   * The app block ARN with which the application should be associated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-appblockarn)
   */
  public fun appBlockArn(): String

  /**
   * A list of attributes to delete from an application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-attributestodelete)
   */
  public fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
      emptyList()

  /**
   * The description of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the application.
   *
   * This name is visible to users in the application catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The icon S3 location of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
   */
  public fun iconS3Location(): Any

  /**
   * The instance families the application supports.
   *
   * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-instancefamilies)
   */
  public fun instanceFamilies(): List<String>

  /**
   * The launch parameters of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchparameters)
   */
  public fun launchParameters(): String? = unwrap(this).getLaunchParameters()

  /**
   * The launch path of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchpath)
   */
  public fun launchPath(): String

  /**
   * The name of the application.
   *
   * This name is visible to users when a name is not specified in the DisplayName property.
   *
   * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-name)
   */
  public fun name(): String

  /**
   * The platforms the application supports.
   *
   * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-platforms)
   */
  public fun platforms(): List<String>

  /**
   * The tags of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The working directory of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-workingdirectory)
   */
  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appBlockArn The app block ARN with which the application should be associated. 
     */
    public fun appBlockArn(appBlockArn: String)

    /**
     * @param attributesToDelete A list of attributes to delete from an application.
     */
    public fun attributesToDelete(attributesToDelete: List<String>)

    /**
     * @param attributesToDelete A list of attributes to delete from an application.
     */
    public fun attributesToDelete(vararg attributesToDelete: String)

    /**
     * @param description The description of the application.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the application.
     * This name is visible to users in the application catalog.
     */
    public fun displayName(displayName: String)

    /**
     * @param iconS3Location The icon S3 location of the application. 
     */
    public fun iconS3Location(iconS3Location: IResolvable)

    /**
     * @param iconS3Location The icon S3 location of the application. 
     */
    public fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty)

    /**
     * @param iconS3Location The icon S3 location of the application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef88c4577d0c5db3d856fddd2d3a26413ab9b278034dc303578c7f48e02b0e27")
    public fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param instanceFamilies The instance families the application supports. 
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     */
    public fun instanceFamilies(instanceFamilies: List<String>)

    /**
     * @param instanceFamilies The instance families the application supports. 
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     */
    public fun instanceFamilies(vararg instanceFamilies: String)

    /**
     * @param launchParameters The launch parameters of the application.
     */
    public fun launchParameters(launchParameters: String)

    /**
     * @param launchPath The launch path of the application. 
     */
    public fun launchPath(launchPath: String)

    /**
     * @param name The name of the application. 
     * This name is visible to users when a name is not specified in the DisplayName property.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     */
    public fun name(name: String)

    /**
     * @param platforms The platforms the application supports. 
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     */
    public fun platforms(platforms: List<String>)

    /**
     * @param platforms The platforms the application supports. 
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     */
    public fun platforms(vararg platforms: String)

    /**
     * @param tags The tags of the application.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags of the application.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param workingDirectory The working directory of the application.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.appstream.CfnApplicationProps.builder()

    /**
     * @param appBlockArn The app block ARN with which the application should be associated. 
     */
    override fun appBlockArn(appBlockArn: String) {
      cdkBuilder.appBlockArn(appBlockArn)
    }

    /**
     * @param attributesToDelete A list of attributes to delete from an application.
     */
    override fun attributesToDelete(attributesToDelete: List<String>) {
      cdkBuilder.attributesToDelete(attributesToDelete)
    }

    /**
     * @param attributesToDelete A list of attributes to delete from an application.
     */
    override fun attributesToDelete(vararg attributesToDelete: String): Unit =
        attributesToDelete(attributesToDelete.toList())

    /**
     * @param description The description of the application.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the application.
     * This name is visible to users in the application catalog.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param iconS3Location The icon S3 location of the application. 
     */
    override fun iconS3Location(iconS3Location: IResolvable) {
      cdkBuilder.iconS3Location(iconS3Location.let(IResolvable::unwrap))
    }

    /**
     * @param iconS3Location The icon S3 location of the application. 
     */
    override fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty) {
      cdkBuilder.iconS3Location(iconS3Location.let(CfnApplication.S3LocationProperty::unwrap))
    }

    /**
     * @param iconS3Location The icon S3 location of the application. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef88c4577d0c5db3d856fddd2d3a26413ab9b278034dc303578c7f48e02b0e27")
    override
        fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty.Builder.() -> Unit):
        Unit = iconS3Location(CfnApplication.S3LocationProperty(iconS3Location))

    /**
     * @param instanceFamilies The instance families the application supports. 
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     */
    override fun instanceFamilies(instanceFamilies: List<String>) {
      cdkBuilder.instanceFamilies(instanceFamilies)
    }

    /**
     * @param instanceFamilies The instance families the application supports. 
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     */
    override fun instanceFamilies(vararg instanceFamilies: String): Unit =
        instanceFamilies(instanceFamilies.toList())

    /**
     * @param launchParameters The launch parameters of the application.
     */
    override fun launchParameters(launchParameters: String) {
      cdkBuilder.launchParameters(launchParameters)
    }

    /**
     * @param launchPath The launch path of the application. 
     */
    override fun launchPath(launchPath: String) {
      cdkBuilder.launchPath(launchPath)
    }

    /**
     * @param name The name of the application. 
     * This name is visible to users when a name is not specified in the DisplayName property.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param platforms The platforms the application supports. 
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     */
    override fun platforms(platforms: List<String>) {
      cdkBuilder.platforms(platforms)
    }

    /**
     * @param platforms The platforms the application supports. 
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     */
    override fun platforms(vararg platforms: String): Unit = platforms(platforms.toList())

    /**
     * @param tags The tags of the application.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags of the application.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param workingDirectory The working directory of the application.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * The app block ARN with which the application should be associated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-appblockarn)
     */
    override fun appBlockArn(): String = unwrap(this).getAppBlockArn()

    /**
     * A list of attributes to delete from an application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-attributestodelete)
     */
    override fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
        emptyList()

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the application.
     *
     * This name is visible to users in the application catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The icon S3 location of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-icons3location)
     */
    override fun iconS3Location(): Any = unwrap(this).getIconS3Location()

    /**
     * The instance families the application supports.
     *
     * *Allowed Values* : `GENERAL_PURPOSE` | `GRAPHICS_G4`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-instancefamilies)
     */
    override fun instanceFamilies(): List<String> = unwrap(this).getInstanceFamilies()

    /**
     * The launch parameters of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchparameters)
     */
    override fun launchParameters(): String? = unwrap(this).getLaunchParameters()

    /**
     * The launch path of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-launchpath)
     */
    override fun launchPath(): String = unwrap(this).getLaunchPath()

    /**
     * The name of the application.
     *
     * This name is visible to users when a name is not specified in the DisplayName property.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The platforms the application supports.
     *
     * *Allowed Values* : `WINDOWS_SERVER_2019` | `AMAZON_LINUX2`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-platforms)
     */
    override fun platforms(): List<String> = unwrap(this).getPlatforms()

    /**
     * The tags of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The working directory of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-application.html#cfn-appstream-application-workingdirectory)
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.appstream.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnApplicationProps
  }
}
