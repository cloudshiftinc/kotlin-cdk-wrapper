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
   * A URL to the S3 bucket for the package that contains the template fragment and schema files for
   * the module version to register.
   *
   * For more information, see [Module structure and
   * requirements](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules-structure.html)
   * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
   *
   *
   * To register the module version, you must have `s3:GetObject` permissions to access the S3
   * objects.
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
     * @param modulePackage A URL to the S3 bucket for the package that contains the template
     * fragment and schema files for the module version to register. 
     * For more information, see [Module structure and
     * requirements](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules-structure.html)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     *
     * To register the module version, you must have `s3:GetObject` permissions to access the S3
     * objects.
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
     * @param modulePackage A URL to the S3 bucket for the package that contains the template
     * fragment and schema files for the module version to register. 
     * For more information, see [Module structure and
     * requirements](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules-structure.html)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     *
     * To register the module version, you must have `s3:GetObject` permissions to access the S3
     * objects.
     */
    override fun modulePackage(modulePackage: String) {
      cdkBuilder.modulePackage(modulePackage)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps,
  ) : CdkObject(cdkObject),
      CfnModuleVersionProps {
    /**
     * The name of the module being registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulename)
     */
    override fun moduleName(): String = unwrap(this).getModuleName()

    /**
     * A URL to the S3 bucket for the package that contains the template fragment and schema files
     * for the module version to register.
     *
     * For more information, see [Module structure and
     * requirements](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules-structure.html)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     *
     * To register the module version, you must have `s3:GetObject` permissions to access the S3
     * objects.
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
