@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAppBlock`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnAppBlockProps cfnAppBlockProps = CfnAppBlockProps.builder()
 * .name("name")
 * .sourceS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .displayName("displayName")
 * .packagingType("packagingType")
 * .postSetupScriptDetails(ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build())
 * .setupScriptDetails(ScriptDetailsProperty.builder()
 * .executablePath("executablePath")
 * .scriptS3Location(S3LocationProperty.builder()
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .s3Key("s3Key")
 * .build())
 * .timeoutInSeconds(123)
 * // the properties below are optional
 * .executableParameters("executableParameters")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html)
 */
public interface CfnAppBlockProps {
  /**
   * The description of the app block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the app block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The name of the app block.
   *
   * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-name)
   */
  public fun name(): String

  /**
   * The packaging type of the app block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-packagingtype)
   */
  public fun packagingType(): String? = unwrap(this).getPackagingType()

  /**
   * The post setup script details of the app block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
   */
  public fun postSetupScriptDetails(): Any? = unwrap(this).getPostSetupScriptDetails()

  /**
   * The setup script details of the app block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
   */
  public fun setupScriptDetails(): Any? = unwrap(this).getSetupScriptDetails()

  /**
   * The source S3 location of the app block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
   */
  public fun sourceS3Location(): Any

  /**
   * The tags of the app block.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAppBlockProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the app block.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the app block.
     */
    public fun displayName(displayName: String)

    /**
     * @param name The name of the app block. 
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     */
    public fun name(name: String)

    /**
     * @param packagingType The packaging type of the app block.
     */
    public fun packagingType(packagingType: String)

    /**
     * @param postSetupScriptDetails The post setup script details of the app block.
     */
    public fun postSetupScriptDetails(postSetupScriptDetails: IResolvable)

    /**
     * @param postSetupScriptDetails The post setup script details of the app block.
     */
    public fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty)

    /**
     * @param postSetupScriptDetails The post setup script details of the app block.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69d65117d6eff68fb390e4b810e147f744e2b78eedf6534b0b7b8687e601d211")
    public
        fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty.Builder.() -> Unit)

    /**
     * @param sourceS3Location The source S3 location of the app block. 
     */
    public fun sourceS3Location(sourceS3Location: IResolvable)

    /**
     * @param sourceS3Location The source S3 location of the app block. 
     */
    public fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty)

    /**
     * @param sourceS3Location The source S3 location of the app block. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d6c12b3e575d63c0d58f3aac3356a076b5aa6d1e1e006641f4c7d3a5c03d20")
    public fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags of the app block.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags of the app block.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param setupScriptDetails The setup script details of the app block.
     */
    public fun upScriptDetails(setupScriptDetails: IResolvable)

    /**
     * @param setupScriptDetails The setup script details of the app block.
     */
    public fun upScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty)

    /**
     * @param setupScriptDetails The setup script details of the app block.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db995324b8b4ec7653a6e67f0ed64e37b1788dbbcab9e54b1cfbec7c348a543d")
    public
        fun upScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnAppBlockProps.Builder =
        software.amazon.awscdk.services.appstream.CfnAppBlockProps.builder()

    /**
     * @param description The description of the app block.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the app block.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param name The name of the app block. 
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param packagingType The packaging type of the app block.
     */
    override fun packagingType(packagingType: String) {
      cdkBuilder.packagingType(packagingType)
    }

    /**
     * @param postSetupScriptDetails The post setup script details of the app block.
     */
    override fun postSetupScriptDetails(postSetupScriptDetails: IResolvable) {
      cdkBuilder.postSetupScriptDetails(postSetupScriptDetails.let(IResolvable::unwrap))
    }

    /**
     * @param postSetupScriptDetails The post setup script details of the app block.
     */
    override fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
      cdkBuilder.postSetupScriptDetails(postSetupScriptDetails.let(CfnAppBlock.ScriptDetailsProperty::unwrap))
    }

    /**
     * @param postSetupScriptDetails The post setup script details of the app block.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("69d65117d6eff68fb390e4b810e147f744e2b78eedf6534b0b7b8687e601d211")
    override
        fun postSetupScriptDetails(postSetupScriptDetails: CfnAppBlock.ScriptDetailsProperty.Builder.() -> Unit):
        Unit = postSetupScriptDetails(CfnAppBlock.ScriptDetailsProperty(postSetupScriptDetails))

    /**
     * @param sourceS3Location The source S3 location of the app block. 
     */
    override fun sourceS3Location(sourceS3Location: IResolvable) {
      cdkBuilder.sourceS3Location(sourceS3Location.let(IResolvable::unwrap))
    }

    /**
     * @param sourceS3Location The source S3 location of the app block. 
     */
    override fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty) {
      cdkBuilder.sourceS3Location(sourceS3Location.let(CfnAppBlock.S3LocationProperty::unwrap))
    }

    /**
     * @param sourceS3Location The source S3 location of the app block. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d6c12b3e575d63c0d58f3aac3356a076b5aa6d1e1e006641f4c7d3a5c03d20")
    override
        fun sourceS3Location(sourceS3Location: CfnAppBlock.S3LocationProperty.Builder.() -> Unit):
        Unit = sourceS3Location(CfnAppBlock.S3LocationProperty(sourceS3Location))

    /**
     * @param tags The tags of the app block.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags of the app block.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param setupScriptDetails The setup script details of the app block.
     */
    override fun upScriptDetails(setupScriptDetails: IResolvable) {
      cdkBuilder.setupScriptDetails(setupScriptDetails.let(IResolvable::unwrap))
    }

    /**
     * @param setupScriptDetails The setup script details of the app block.
     */
    override fun upScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty) {
      cdkBuilder.setupScriptDetails(setupScriptDetails.let(CfnAppBlock.ScriptDetailsProperty::unwrap))
    }

    /**
     * @param setupScriptDetails The setup script details of the app block.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db995324b8b4ec7653a6e67f0ed64e37b1788dbbcab9e54b1cfbec7c348a543d")
    override
        fun upScriptDetails(setupScriptDetails: CfnAppBlock.ScriptDetailsProperty.Builder.() -> Unit):
        Unit = upScriptDetails(CfnAppBlock.ScriptDetailsProperty(setupScriptDetails))

    public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlockProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockProps,
  ) : CdkObject(cdkObject), CfnAppBlockProps {
    /**
     * The description of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The name of the app block.
     *
     * *Pattern* : `^[a-zA-Z0-9][a-zA-Z0-9_.-]{0,100}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The packaging type of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-packagingtype)
     */
    override fun packagingType(): String? = unwrap(this).getPackagingType()

    /**
     * The post setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-postsetupscriptdetails)
     */
    override fun postSetupScriptDetails(): Any? = unwrap(this).getPostSetupScriptDetails()

    /**
     * The setup script details of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-setupscriptdetails)
     */
    override fun setupScriptDetails(): Any? = unwrap(this).getSetupScriptDetails()

    /**
     * The source S3 location of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-sources3location)
     */
    override fun sourceS3Location(): Any = unwrap(this).getSourceS3Location()

    /**
     * The tags of the app block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblock.html#cfn-appstream-appblock-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppBlockProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockProps):
        CfnAppBlockProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAppBlockProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppBlockProps):
        software.amazon.awscdk.services.appstream.CfnAppBlockProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appstream.CfnAppBlockProps
  }
}
