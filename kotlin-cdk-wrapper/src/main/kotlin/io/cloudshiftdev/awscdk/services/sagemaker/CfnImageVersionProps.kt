@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnImageVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnImageVersionProps cfnImageVersionProps = CfnImageVersionProps.builder()
 * .baseImage("baseImage")
 * .imageName("imageName")
 * // the properties below are optional
 * .alias("alias")
 * .aliases(List.of("aliases"))
 * .horovod(false)
 * .jobType("jobType")
 * .mlFramework("mlFramework")
 * .processor("processor")
 * .programmingLang("programmingLang")
 * .releaseNotes("releaseNotes")
 * .vendorGuidance("vendorGuidance")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html)
 */
public interface CfnImageVersionProps {
  /**
   * The alias of the image version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-alias)
   */
  public fun alias(): String? = unwrap(this).getAlias()

  /**
   * List of aliases for the image version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-aliases)
   */
  public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

  /**
   * The container image that the SageMaker image version is based on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-baseimage)
   */
  public fun baseImage(): String

  /**
   * Indicates Horovod compatibility.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-horovod)
   */
  public fun horovod(): Any? = unwrap(this).getHorovod()

  /**
   * The name of the parent image.
   *
   * *Length Constraints* : Minimum length of 1. Maximum length of 63.
   *
   * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-imagename)
   */
  public fun imageName(): String

  /**
   * Indicates SageMaker job type compatibility.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-jobtype)
   */
  public fun jobType(): String? = unwrap(this).getJobType()

  /**
   * The machine learning framework vended in the image version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-mlframework)
   */
  public fun mlFramework(): String? = unwrap(this).getMlFramework()

  /**
   * Indicates CPU or GPU compatibility.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-processor)
   */
  public fun processor(): String? = unwrap(this).getProcessor()

  /**
   * The supported programming language and its version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-programminglang)
   */
  public fun programmingLang(): String? = unwrap(this).getProgrammingLang()

  /**
   * The maintainer description of the image version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-releasenotes)
   */
  public fun releaseNotes(): String? = unwrap(this).getReleaseNotes()

  /**
   * The availability of the image version specified by the maintainer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-vendorguidance)
   */
  public fun vendorGuidance(): String? = unwrap(this).getVendorGuidance()

  /**
   * A builder for [CfnImageVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alias The alias of the image version.
     */
    public fun alias(alias: String)

    /**
     * @param aliases List of aliases for the image version.
     */
    public fun aliases(aliases: List<String>)

    /**
     * @param aliases List of aliases for the image version.
     */
    public fun aliases(vararg aliases: String)

    /**
     * @param baseImage The container image that the SageMaker image version is based on. 
     */
    public fun baseImage(baseImage: String)

    /**
     * @param horovod Indicates Horovod compatibility.
     */
    public fun horovod(horovod: Boolean)

    /**
     * @param horovod Indicates Horovod compatibility.
     */
    public fun horovod(horovod: IResolvable)

    /**
     * @param imageName The name of the parent image. 
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     */
    public fun imageName(imageName: String)

    /**
     * @param jobType Indicates SageMaker job type compatibility.
     */
    public fun jobType(jobType: String)

    /**
     * @param mlFramework The machine learning framework vended in the image version.
     */
    public fun mlFramework(mlFramework: String)

    /**
     * @param processor Indicates CPU or GPU compatibility.
     */
    public fun processor(processor: String)

    /**
     * @param programmingLang The supported programming language and its version.
     */
    public fun programmingLang(programmingLang: String)

    /**
     * @param releaseNotes The maintainer description of the image version.
     */
    public fun releaseNotes(releaseNotes: String)

    /**
     * @param vendorGuidance The availability of the image version specified by the maintainer.
     */
    public fun vendorGuidance(vendorGuidance: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnImageVersionProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnImageVersionProps.builder()

    /**
     * @param alias The alias of the image version.
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * @param aliases List of aliases for the image version.
     */
    override fun aliases(aliases: List<String>) {
      cdkBuilder.aliases(aliases)
    }

    /**
     * @param aliases List of aliases for the image version.
     */
    override fun aliases(vararg aliases: String): Unit = aliases(aliases.toList())

    /**
     * @param baseImage The container image that the SageMaker image version is based on. 
     */
    override fun baseImage(baseImage: String) {
      cdkBuilder.baseImage(baseImage)
    }

    /**
     * @param horovod Indicates Horovod compatibility.
     */
    override fun horovod(horovod: Boolean) {
      cdkBuilder.horovod(horovod)
    }

    /**
     * @param horovod Indicates Horovod compatibility.
     */
    override fun horovod(horovod: IResolvable) {
      cdkBuilder.horovod(horovod.let(IResolvable::unwrap))
    }

    /**
     * @param imageName The name of the parent image. 
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    /**
     * @param jobType Indicates SageMaker job type compatibility.
     */
    override fun jobType(jobType: String) {
      cdkBuilder.jobType(jobType)
    }

    /**
     * @param mlFramework The machine learning framework vended in the image version.
     */
    override fun mlFramework(mlFramework: String) {
      cdkBuilder.mlFramework(mlFramework)
    }

    /**
     * @param processor Indicates CPU or GPU compatibility.
     */
    override fun processor(processor: String) {
      cdkBuilder.processor(processor)
    }

    /**
     * @param programmingLang The supported programming language and its version.
     */
    override fun programmingLang(programmingLang: String) {
      cdkBuilder.programmingLang(programmingLang)
    }

    /**
     * @param releaseNotes The maintainer description of the image version.
     */
    override fun releaseNotes(releaseNotes: String) {
      cdkBuilder.releaseNotes(releaseNotes)
    }

    /**
     * @param vendorGuidance The availability of the image version specified by the maintainer.
     */
    override fun vendorGuidance(vendorGuidance: String) {
      cdkBuilder.vendorGuidance(vendorGuidance)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnImageVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageVersionProps,
  ) : CdkObject(cdkObject), CfnImageVersionProps {
    /**
     * The alias of the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-alias)
     */
    override fun alias(): String? = unwrap(this).getAlias()

    /**
     * List of aliases for the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-aliases)
     */
    override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    /**
     * The container image that the SageMaker image version is based on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-baseimage)
     */
    override fun baseImage(): String = unwrap(this).getBaseImage()

    /**
     * Indicates Horovod compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-horovod)
     */
    override fun horovod(): Any? = unwrap(this).getHorovod()

    /**
     * The name of the parent image.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-imagename)
     */
    override fun imageName(): String = unwrap(this).getImageName()

    /**
     * Indicates SageMaker job type compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-jobtype)
     */
    override fun jobType(): String? = unwrap(this).getJobType()

    /**
     * The machine learning framework vended in the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-mlframework)
     */
    override fun mlFramework(): String? = unwrap(this).getMlFramework()

    /**
     * Indicates CPU or GPU compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-processor)
     */
    override fun processor(): String? = unwrap(this).getProcessor()

    /**
     * The supported programming language and its version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-programminglang)
     */
    override fun programmingLang(): String? = unwrap(this).getProgrammingLang()

    /**
     * The maintainer description of the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-releasenotes)
     */
    override fun releaseNotes(): String? = unwrap(this).getReleaseNotes()

    /**
     * The availability of the image version specified by the maintainer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-vendorguidance)
     */
    override fun vendorGuidance(): String? = unwrap(this).getVendorGuidance()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageVersionProps):
        CfnImageVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnImageVersionProps):
        software.amazon.awscdk.services.sagemaker.CfnImageVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnImageVersionProps
  }
}
