@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnModuleVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnModuleVersionProps cfnModuleVersionProps = CfnModuleVersionProps.builder()
 * .moduleName("moduleName")
 * .modulePackage("modulePackage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)
 */
public interface CfnModuleVersionProps {
  /**
   * The name of the module being registered.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulename)
   */
  public fun moduleName(): String

  /**
   * A URL to the S3 bucket containing the package that contains the template fragment and schema
   * files for the module version to register.
   *
   *
   * The user registering the module version must be able to access the module package in the S3
   * bucket. That's, the user needs to have
   * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
   * the package. For more information, see [Actions, Resources, and Condition Keys for Amazon
   * S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS Identity and
   * Access Management User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulepackage)
   */
  public fun modulePackage(): String

  /**
   * A builder for [CfnModuleVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param moduleName The name of the module being registered. 
     */
    public fun moduleName(moduleName: String)

    /**
     * @param modulePackage A URL to the S3 bucket containing the package that contains the template
     * fragment and schema files for the module version to register. 
     *
     * The user registering the module version must be able to access the module package in the S3
     * bucket. That's, the user needs to have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the package. For more information, see [Actions, Resources, and Condition Keys for Amazon
     * S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS Identity
     * and Access Management User Guide* .
     */
    public fun modulePackage(modulePackage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps.builder()

    /**
     * @param moduleName The name of the module being registered. 
     */
    override fun moduleName(moduleName: String) {
      cdkBuilder.moduleName(moduleName)
    }

    /**
     * @param modulePackage A URL to the S3 bucket containing the package that contains the template
     * fragment and schema files for the module version to register. 
     *
     * The user registering the module version must be able to access the module package in the S3
     * bucket. That's, the user needs to have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the package. For more information, see [Actions, Resources, and Condition Keys for Amazon
     * S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS Identity
     * and Access Management User Guide* .
     */
    override fun modulePackage(modulePackage: String) {
      cdkBuilder.modulePackage(modulePackage)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps,
  ) : CdkObject(cdkObject), CfnModuleVersionProps {
    /**
     * The name of the module being registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulename)
     */
    override fun moduleName(): String = unwrap(this).getModuleName()

    /**
     * A URL to the S3 bucket containing the package that contains the template fragment and schema
     * files for the module version to register.
     *
     *
     * The user registering the module version must be able to access the module package in the S3
     * bucket. That's, the user needs to have
     * [GetObject](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html) permissions for
     * the package. For more information, see [Actions, Resources, and Condition Keys for Amazon
     * S3](https://docs.aws.amazon.com/IAM/latest/UserGuide/list_amazons3.html) in the *AWS Identity
     * and Access Management User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulepackage)
     */
    override fun modulePackage(): String = unwrap(this).getModulePackage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModuleVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps):
        CfnModuleVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnModuleVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModuleVersionProps):
        software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps
  }
}
