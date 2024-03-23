@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a version of the SageMaker image specified by `ImageName` .
 *
 * The version represents the Amazon Container Registry (ECR) container image specified by
 * `BaseImage` .
 *
 *
 * You can use the `DependsOn` attribute to specify that the creation of a specific resource follows
 * another. You can use it for the following use cases. For more information, see [`DependsOn`
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * .
 *
 *
 * * `DependsOn` can be used to establish a parent/child relationship between `ImageVersion` and
 * `Image` where the `ImageVersion` `DependsOn` the `Image` .
 * * `DependsOn` can be used to establish order among `ImageVersion` s within the same `Image`
 * namespace. For example, if ImageVersionB `DependsOn` ImageVersionA and both share the same parent
 * `Image` , then ImageVersionA is version N and ImageVersionB is N+1.
 *
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnImageVersion cfnImageVersion = CfnImageVersion.Builder.create(this, "MyCfnImageVersion")
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
public open class CfnImageVersion(
  cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageVersion,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnImageVersionProps,
  ) :
      this(software.amazon.awscdk.services.sagemaker.CfnImageVersion(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnImageVersionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnImageVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnImageVersionProps(props)
  )

  /**
   * The alias of the image version.
   */
  public open fun alias(): String? = unwrap(this).getAlias()

  /**
   * The alias of the image version.
   */
  public open fun alias(`value`: String) {
    unwrap(this).setAlias(`value`)
  }

  /**
   * List of aliases for the image version.
   */
  public open fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

  /**
   * List of aliases for the image version.
   */
  public open fun aliases(`value`: List<String>) {
    unwrap(this).setAliases(`value`)
  }

  /**
   * List of aliases for the image version.
   */
  public open fun aliases(vararg `value`: String): Unit = aliases(`value`.toList())

  /**
   * The URI of the container image version referenced by ImageVersion.
   */
  public open fun attrContainerImage(): String = unwrap(this).getAttrContainerImage()

  /**
   * The Amazon Resource Name (ARN) of the parent Image.
   */
  public open fun attrImageArn(): String = unwrap(this).getAttrImageArn()

  /**
   * The Amazon Resource Name (ARN) of the image version.
   *
   * *Type* : String
   *
   * *Length Constraints* : Maximum length of 256.
   *
   * *Pattern* : `^arn:aws(-[\w]+)*:sagemaker:.+:[0-9]{12}:image-version/[a-z0-9]([-.]?[a-z0-9])*
   * /[0-9]+$`
   */
  public open fun attrImageVersionArn(): String = unwrap(this).getAttrImageVersionArn()

  /**
   * The version of the image.
   */
  public open fun attrVersion(): Number = unwrap(this).getAttrVersion()

  /**
   * The container image that the SageMaker image version is based on.
   */
  public open fun baseImage(): String = unwrap(this).getBaseImage()

  /**
   * The container image that the SageMaker image version is based on.
   */
  public open fun baseImage(`value`: String) {
    unwrap(this).setBaseImage(`value`)
  }

  /**
   * Indicates Horovod compatibility.
   */
  public open fun horovod(): Any? = unwrap(this).getHorovod()

  /**
   * Indicates Horovod compatibility.
   */
  public open fun horovod(`value`: Boolean) {
    unwrap(this).setHorovod(`value`)
  }

  /**
   * Indicates Horovod compatibility.
   */
  public open fun horovod(`value`: IResolvable) {
    unwrap(this).setHorovod(`value`.let(IResolvable::unwrap))
  }

  /**
   * The name of the parent image.
   */
  public open fun imageName(): String = unwrap(this).getImageName()

  /**
   * The name of the parent image.
   */
  public open fun imageName(`value`: String) {
    unwrap(this).setImageName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Indicates SageMaker job type compatibility.
   */
  public open fun jobType(): String? = unwrap(this).getJobType()

  /**
   * Indicates SageMaker job type compatibility.
   */
  public open fun jobType(`value`: String) {
    unwrap(this).setJobType(`value`)
  }

  /**
   * The machine learning framework vended in the image version.
   */
  public open fun mlFramework(): String? = unwrap(this).getMlFramework()

  /**
   * The machine learning framework vended in the image version.
   */
  public open fun mlFramework(`value`: String) {
    unwrap(this).setMlFramework(`value`)
  }

  /**
   * Indicates CPU or GPU compatibility.
   */
  public open fun processor(): String? = unwrap(this).getProcessor()

  /**
   * Indicates CPU or GPU compatibility.
   */
  public open fun processor(`value`: String) {
    unwrap(this).setProcessor(`value`)
  }

  /**
   * The supported programming language and its version.
   */
  public open fun programmingLang(): String? = unwrap(this).getProgrammingLang()

  /**
   * The supported programming language and its version.
   */
  public open fun programmingLang(`value`: String) {
    unwrap(this).setProgrammingLang(`value`)
  }

  /**
   * The maintainer description of the image version.
   */
  public open fun releaseNotes(): String? = unwrap(this).getReleaseNotes()

  /**
   * The maintainer description of the image version.
   */
  public open fun releaseNotes(`value`: String) {
    unwrap(this).setReleaseNotes(`value`)
  }

  /**
   * The availability of the image version specified by the maintainer.
   */
  public open fun vendorGuidance(): String? = unwrap(this).getVendorGuidance()

  /**
   * The availability of the image version specified by the maintainer.
   */
  public open fun vendorGuidance(`value`: String) {
    unwrap(this).setVendorGuidance(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnImageVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The alias of the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-alias)
     * @param alias The alias of the image version. 
     */
    public fun alias(alias: String)

    /**
     * List of aliases for the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-aliases)
     * @param aliases List of aliases for the image version. 
     */
    public fun aliases(aliases: List<String>)

    /**
     * List of aliases for the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-aliases)
     * @param aliases List of aliases for the image version. 
     */
    public fun aliases(vararg aliases: String)

    /**
     * The container image that the SageMaker image version is based on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-baseimage)
     * @param baseImage The container image that the SageMaker image version is based on. 
     */
    public fun baseImage(baseImage: String)

    /**
     * Indicates Horovod compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-horovod)
     * @param horovod Indicates Horovod compatibility. 
     */
    public fun horovod(horovod: Boolean)

    /**
     * Indicates Horovod compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-horovod)
     * @param horovod Indicates Horovod compatibility. 
     */
    public fun horovod(horovod: IResolvable)

    /**
     * The name of the parent image.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-imagename)
     * @param imageName The name of the parent image. 
     */
    public fun imageName(imageName: String)

    /**
     * Indicates SageMaker job type compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-jobtype)
     * @param jobType Indicates SageMaker job type compatibility. 
     */
    public fun jobType(jobType: String)

    /**
     * The machine learning framework vended in the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-mlframework)
     * @param mlFramework The machine learning framework vended in the image version. 
     */
    public fun mlFramework(mlFramework: String)

    /**
     * Indicates CPU or GPU compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-processor)
     * @param processor Indicates CPU or GPU compatibility. 
     */
    public fun processor(processor: String)

    /**
     * The supported programming language and its version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-programminglang)
     * @param programmingLang The supported programming language and its version. 
     */
    public fun programmingLang(programmingLang: String)

    /**
     * The maintainer description of the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-releasenotes)
     * @param releaseNotes The maintainer description of the image version. 
     */
    public fun releaseNotes(releaseNotes: String)

    /**
     * The availability of the image version specified by the maintainer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-vendorguidance)
     * @param vendorGuidance The availability of the image version specified by the maintainer. 
     */
    public fun vendorGuidance(vendorGuidance: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnImageVersion.Builder =
        software.amazon.awscdk.services.sagemaker.CfnImageVersion.Builder.create(scope, id)

    /**
     * The alias of the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-alias)
     * @param alias The alias of the image version. 
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * List of aliases for the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-aliases)
     * @param aliases List of aliases for the image version. 
     */
    override fun aliases(aliases: List<String>) {
      cdkBuilder.aliases(aliases)
    }

    /**
     * List of aliases for the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-aliases)
     * @param aliases List of aliases for the image version. 
     */
    override fun aliases(vararg aliases: String): Unit = aliases(aliases.toList())

    /**
     * The container image that the SageMaker image version is based on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-baseimage)
     * @param baseImage The container image that the SageMaker image version is based on. 
     */
    override fun baseImage(baseImage: String) {
      cdkBuilder.baseImage(baseImage)
    }

    /**
     * Indicates Horovod compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-horovod)
     * @param horovod Indicates Horovod compatibility. 
     */
    override fun horovod(horovod: Boolean) {
      cdkBuilder.horovod(horovod)
    }

    /**
     * Indicates Horovod compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-horovod)
     * @param horovod Indicates Horovod compatibility. 
     */
    override fun horovod(horovod: IResolvable) {
      cdkBuilder.horovod(horovod.let(IResolvable::unwrap))
    }

    /**
     * The name of the parent image.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-imagename)
     * @param imageName The name of the parent image. 
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    /**
     * Indicates SageMaker job type compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-jobtype)
     * @param jobType Indicates SageMaker job type compatibility. 
     */
    override fun jobType(jobType: String) {
      cdkBuilder.jobType(jobType)
    }

    /**
     * The machine learning framework vended in the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-mlframework)
     * @param mlFramework The machine learning framework vended in the image version. 
     */
    override fun mlFramework(mlFramework: String) {
      cdkBuilder.mlFramework(mlFramework)
    }

    /**
     * Indicates CPU or GPU compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-processor)
     * @param processor Indicates CPU or GPU compatibility. 
     */
    override fun processor(processor: String) {
      cdkBuilder.processor(processor)
    }

    /**
     * The supported programming language and its version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-programminglang)
     * @param programmingLang The supported programming language and its version. 
     */
    override fun programmingLang(programmingLang: String) {
      cdkBuilder.programmingLang(programmingLang)
    }

    /**
     * The maintainer description of the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-releasenotes)
     * @param releaseNotes The maintainer description of the image version. 
     */
    override fun releaseNotes(releaseNotes: String) {
      cdkBuilder.releaseNotes(releaseNotes)
    }

    /**
     * The availability of the image version specified by the maintainer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-vendorguidance)
     * @param vendorGuidance The availability of the image version specified by the maintainer. 
     */
    override fun vendorGuidance(vendorGuidance: String) {
      cdkBuilder.vendorGuidance(vendorGuidance)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnImageVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnImageVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImageVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImageVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageVersion):
        CfnImageVersion = CfnImageVersion(cdkObject)

    internal fun unwrap(wrapped: CfnImageVersion):
        software.amazon.awscdk.services.sagemaker.CfnImageVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.sagemaker.CfnImageVersion
  }
}
