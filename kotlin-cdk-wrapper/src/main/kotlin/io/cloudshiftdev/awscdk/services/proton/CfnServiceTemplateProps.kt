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
 * Properties for defining a `CfnServiceTemplate`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.proton.*;
 * CfnServiceTemplateProps cfnServiceTemplateProps = CfnServiceTemplateProps.builder()
 * .description("description")
 * .displayName("displayName")
 * .encryptionKey("encryptionKey")
 * .name("name")
 * .pipelineProvisioning("pipelineProvisioning")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html)
 */
public interface CfnServiceTemplateProps {
  /**
   * A description of the service template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The service template name as displayed in the developer interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The customer provided service template encryption key that's used to encrypt data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-encryptionkey)
   */
  public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The name of the service template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * If `pipelineProvisioning` is `true` , a service pipeline is included in the service template.
   *
   * Otherwise, a service pipeline *isn't* included in the service template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-pipelineprovisioning)
   */
  public fun pipelineProvisioning(): String? = unwrap(this).getPipelineProvisioning()

  /**
   * An object that includes the template bundle S3 bucket path and name for the new version of a
   * service template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnServiceTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the service template.
     */
    public fun description(description: String)

    /**
     * @param displayName The service template name as displayed in the developer interface.
     */
    public fun displayName(displayName: String)

    /**
     * @param encryptionKey The customer provided service template encryption key that's used to
     * encrypt data.
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * @param name The name of the service template.
     */
    public fun name(name: String)

    /**
     * @param pipelineProvisioning If `pipelineProvisioning` is `true` , a service pipeline is
     * included in the service template.
     * Otherwise, a service pipeline *isn't* included in the service template.
     */
    public fun pipelineProvisioning(pipelineProvisioning: String)

    /**
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     * version of a service template.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     * version of a service template.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.proton.CfnServiceTemplateProps.Builder =
        software.amazon.awscdk.services.proton.CfnServiceTemplateProps.builder()

    /**
     * @param description A description of the service template.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The service template name as displayed in the developer interface.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param encryptionKey The customer provided service template encryption key that's used to
     * encrypt data.
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param name The name of the service template.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param pipelineProvisioning If `pipelineProvisioning` is `true` , a service pipeline is
     * included in the service template.
     * Otherwise, a service pipeline *isn't* included in the service template.
     */
    override fun pipelineProvisioning(pipelineProvisioning: String) {
      cdkBuilder.pipelineProvisioning(pipelineProvisioning)
    }

    /**
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     * version of a service template.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An object that includes the template bundle S3 bucket path and name for the new
     * version of a service template.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.proton.CfnServiceTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.proton.CfnServiceTemplateProps,
  ) : CdkObject(cdkObject), CfnServiceTemplateProps {
    /**
     * A description of the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The service template name as displayed in the developer interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The customer provided service template encryption key that's used to encrypt data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-encryptionkey)
     */
    override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    /**
     * The name of the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * If `pipelineProvisioning` is `true` , a service pipeline is included in the service template.
     *
     * Otherwise, a service pipeline *isn't* included in the service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-pipelineprovisioning)
     */
    override fun pipelineProvisioning(): String? = unwrap(this).getPipelineProvisioning()

    /**
     * An object that includes the template bundle S3 bucket path and name for the new version of a
     * service template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-proton-servicetemplate.html#cfn-proton-servicetemplate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnServiceTemplateProps):
        CfnServiceTemplateProps = CdkObjectWrappers.wrap(cdkObject) as? CfnServiceTemplateProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceTemplateProps):
        software.amazon.awscdk.services.proton.CfnServiceTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.proton.CfnServiceTemplateProps
  }
}
