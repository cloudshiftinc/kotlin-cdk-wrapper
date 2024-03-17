@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.proton

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEnvironmentTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.proton.*;
 * CfnEnvironmentTemplateProps cfnEnvironmentTemplateProps = CfnEnvironmentTemplateProps.builder()
 * .description("description")
 * .displayName("displayName")
 * .encryptionKey("encryptionKey")
 * .name("name")
 * .provisioning("provisioning")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html)
 */
public interface CfnEnvironmentTemplateProps {
  /**
   * A description of the environment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the environment template as displayed in the developer interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The customer provided encryption key for the environment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-encryptionkey)
   */
  public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The name of the environment template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * When included, indicates that the environment template is for customer provisioned and managed
   * infrastructure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-provisioning)
   */
  public fun provisioning(): String? = unwrap(this).getProvisioning()

  /**
   * An optional list of metadata items that you can associate with the AWS Proton environment
   * template.
   *
   * A tag is a key-value pair.
   *
   * For more information, see [AWS Proton resources and
   * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEnvironmentTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the environment template.
     */
    public fun description(description: String)

    /**
     * @param displayName The name of the environment template as displayed in the developer
     * interface.
     */
    public fun displayName(displayName: String)

    /**
     * @param encryptionKey The customer provided encryption key for the environment template.
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * @param name The name of the environment template.
     */
    public fun name(name: String)

    /**
     * @param provisioning When included, indicates that the environment template is for customer
     * provisioned and managed infrastructure.
     */
    public fun provisioning(provisioning: String)

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment template.
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment template.
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps.Builder =
        software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps.builder()

    /**
     * @param description A description of the environment template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The name of the environment template as displayed in the developer
     * interface.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param encryptionKey The customer provided encryption key for the environment template.
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param name The name of the environment template.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param provisioning When included, indicates that the environment template is for customer
     * provisioned and managed infrastructure.
     */
    override fun provisioning(provisioning: String) {
      cdkBuilder.provisioning(provisioning)
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment template.
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional list of metadata items that you can associate with the AWS Proton
     * environment template.
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps,
  ) : CdkObject(cdkObject), CfnEnvironmentTemplateProps {
    /**
     * A description of the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the environment template as displayed in the developer interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The customer provided encryption key for the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-encryptionkey)
     */
    override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    /**
     * The name of the environment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * When included, indicates that the environment template is for customer provisioned and
     * managed infrastructure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-provisioning)
     */
    override fun provisioning(): String? = unwrap(this).getProvisioning()

    /**
     * An optional list of metadata items that you can associate with the AWS Proton environment
     * template.
     *
     * A tag is a key-value pair.
     *
     * For more information, see [AWS Proton resources and
     * tagging](https://docs.aws.amazon.com/proton/latest/userguide/resources.html) in the *AWS Proton
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-environmenttemplate.html#cfn-proton-environmenttemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps):
        CfnEnvironmentTemplateProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnEnvironmentTemplateProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentTemplateProps):
        software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.proton.CfnEnvironmentTemplateProps
  }
}
