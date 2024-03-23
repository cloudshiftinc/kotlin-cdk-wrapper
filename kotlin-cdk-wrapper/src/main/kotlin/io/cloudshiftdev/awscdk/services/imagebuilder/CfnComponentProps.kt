@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnComponent`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnComponentProps cfnComponentProps = CfnComponentProps.builder()
 * .name("name")
 * .platform("platform")
 * .version("version")
 * // the properties below are optional
 * .changeDescription("changeDescription")
 * .data("data")
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .supportedOsVersions(List.of("supportedOsVersions"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html)
 */
public interface CfnComponentProps {
  /**
   * The change description of the component.
   *
   * Describes what change has been made in this version, or what makes this version different from
   * other versions of the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-changedescription)
   */
  public fun changeDescription(): String? = unwrap(this).getChangeDescription()

  /**
   * Component `data` contains inline YAML document content for the component.
   *
   * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3. However,
   * you cannot specify both properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-data)
   */
  public fun `data`(): String? = unwrap(this).getData()

  /**
   * Describes the contents of the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the KMS key that is used to encrypt this component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The name of the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-name)
   */
  public fun name(): String

  /**
   * The operating system platform of the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-platform)
   */
  public fun platform(): String

  /**
   * The operating system (OS) version supported by the component.
   *
   * If the OS information is available, a prefix match is performed against the base image OS
   * version during image recipe creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-supportedosversions)
   */
  public fun supportedOsVersions(): List<String> = unwrap(this).getSupportedOsVersions() ?:
      emptyList()

  /**
   * The tags that apply to the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The `uri` of a YAML component document file.
   *
   * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to access
   * the S3 bucket it points to. If you use Amazon S3, you can specify component content up to your
   * service quota.
   *
   * Alternatively, you can specify the YAML document inline, using the component `data` property.
   * You cannot specify both properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-uri)
   */
  public fun uri(): String? = unwrap(this).getUri()

  /**
   * The component version.
   *
   * For example, `1.0.0` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-version)
   */
  public fun version(): String

  /**
   * A builder for [CfnComponentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param changeDescription The change description of the component.
     * Describes what change has been made in this version, or what makes this version different
     * from other versions of the component.
     */
    public fun changeDescription(changeDescription: String)

    /**
     * @param data Component `data` contains inline YAML document content for the component.
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     */
    public fun `data`(`data`: String)

    /**
     * @param description Describes the contents of the component.
     */
    public fun description(description: String)

    /**
     * @param kmsKeyId The ID of the KMS key that is used to encrypt this component.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param name The name of the component. 
     */
    public fun name(name: String)

    /**
     * @param platform The operating system platform of the component. 
     */
    public fun platform(platform: String)

    /**
     * @param supportedOsVersions The operating system (OS) version supported by the component.
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     */
    public fun supportedOsVersions(supportedOsVersions: List<String>)

    /**
     * @param supportedOsVersions The operating system (OS) version supported by the component.
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     */
    public fun supportedOsVersions(vararg supportedOsVersions: String)

    /**
     * @param tags The tags that apply to the component.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param uri The `uri` of a YAML component document file.
     * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to
     * access the S3 bucket it points to. If you use Amazon S3, you can specify component content up to
     * your service quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     */
    public fun uri(uri: String)

    /**
     * @param version The component version. 
     * For example, `1.0.0` .
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnComponentProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnComponentProps.builder()

    /**
     * @param changeDescription The change description of the component.
     * Describes what change has been made in this version, or what makes this version different
     * from other versions of the component.
     */
    override fun changeDescription(changeDescription: String) {
      cdkBuilder.changeDescription(changeDescription)
    }

    /**
     * @param data Component `data` contains inline YAML document content for the component.
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * @param description Describes the contents of the component.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param kmsKeyId The ID of the KMS key that is used to encrypt this component.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The name of the component. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param platform The operating system platform of the component. 
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param supportedOsVersions The operating system (OS) version supported by the component.
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     */
    override fun supportedOsVersions(supportedOsVersions: List<String>) {
      cdkBuilder.supportedOsVersions(supportedOsVersions)
    }

    /**
     * @param supportedOsVersions The operating system (OS) version supported by the component.
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     */
    override fun supportedOsVersions(vararg supportedOsVersions: String): Unit =
        supportedOsVersions(supportedOsVersions.toList())

    /**
     * @param tags The tags that apply to the component.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param uri The `uri` of a YAML component document file.
     * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to
     * access the S3 bucket it points to. If you use Amazon S3, you can specify component content up to
     * your service quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    /**
     * @param version The component version. 
     * For example, `1.0.0` .
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.imagebuilder.CfnComponentProps,
  ) : CdkObject(cdkObject), CfnComponentProps {
    /**
     * The change description of the component.
     *
     * Describes what change has been made in this version, or what makes this version different
     * from other versions of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-changedescription)
     */
    override fun changeDescription(): String? = unwrap(this).getChangeDescription()

    /**
     * Component `data` contains inline YAML document content for the component.
     *
     * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3.
     * However, you cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-data)
     */
    override fun `data`(): String? = unwrap(this).getData()

    /**
     * Describes the contents of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the KMS key that is used to encrypt this component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The name of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The operating system platform of the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-platform)
     */
    override fun platform(): String = unwrap(this).getPlatform()

    /**
     * The operating system (OS) version supported by the component.
     *
     * If the OS information is available, a prefix match is performed against the base image OS
     * version during image recipe creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-supportedosversions)
     */
    override fun supportedOsVersions(): List<String> = unwrap(this).getSupportedOsVersions() ?:
        emptyList()

    /**
     * The tags that apply to the component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The `uri` of a YAML component document file.
     *
     * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to
     * access the S3 bucket it points to. If you use Amazon S3, you can specify component content up to
     * your service quota.
     *
     * Alternatively, you can specify the YAML document inline, using the component `data` property.
     * You cannot specify both properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-uri)
     */
    override fun uri(): String? = unwrap(this).getUri()

    /**
     * The component version.
     *
     * For example, `1.0.0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-version)
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComponentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnComponentProps):
        CfnComponentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnComponentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnComponentProps):
        software.amazon.awscdk.services.imagebuilder.CfnComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnComponentProps
  }
}
