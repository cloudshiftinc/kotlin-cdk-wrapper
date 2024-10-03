@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnModuleDefaultVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnModuleDefaultVersionProps cfnModuleDefaultVersionProps =
 * CfnModuleDefaultVersionProps.builder()
 * .arn("arn")
 * .moduleName("moduleName")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html)
 */
public interface CfnModuleDefaultVersionProps {
  /**
   * The Amazon Resource Name (ARN) of the module version to set as the default version.
   *
   * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-arn)
   */
  public fun arn(): String? = unwrap(this).getArn()

  /**
   * The name of the module.
   *
   * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-modulename)
   */
  public fun moduleName(): String? = unwrap(this).getModuleName()

  /**
   * The ID for the specific version of the module.
   *
   * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-versionid)
   */
  public fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * A builder for [CfnModuleDefaultVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The Amazon Resource Name (ARN) of the module version to set as the default
     * version.
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     */
    public fun arn(arn: String)

    /**
     * @param moduleName The name of the module.
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     */
    public fun moduleName(moduleName: String)

    /**
     * @param versionId The ID for the specific version of the module.
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     */
    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the module version to set as the default
     * version.
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param moduleName The name of the module.
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     */
    override fun moduleName(moduleName: String) {
      cdkBuilder.moduleName(moduleName)
    }

    /**
     * @param versionId The ID for the specific version of the module.
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps,
  ) : CdkObject(cdkObject),
      CfnModuleDefaultVersionProps {
    /**
     * The Amazon Resource Name (ARN) of the module version to set as the default version.
     *
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-arn)
     */
    override fun arn(): String? = unwrap(this).getArn()

    /**
     * The name of the module.
     *
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-modulename)
     */
    override fun moduleName(): String? = unwrap(this).getModuleName()

    /**
     * The ID for the specific version of the module.
     *
     * Conditional: You must specify either `Arn` , or `ModuleName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduledefaultversion.html#cfn-cloudformation-moduledefaultversion-versionid)
     */
    override fun versionId(): String? = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModuleDefaultVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps):
        CfnModuleDefaultVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnModuleDefaultVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModuleDefaultVersionProps):
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
  }
}
