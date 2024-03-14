package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

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
    private val cdkBuilder: software.amazon.awscdk.CfnModuleDefaultVersionProps.Builder =
        software.amazon.awscdk.CfnModuleDefaultVersionProps.builder()

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

    public fun build(): software.amazon.awscdk.CfnModuleDefaultVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnModuleDefaultVersionProps,
  ) : CdkObject(cdkObject), CfnModuleDefaultVersionProps {
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

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnModuleDefaultVersionProps):
        CfnModuleDefaultVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModuleDefaultVersionProps):
        software.amazon.awscdk.CfnModuleDefaultVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnModuleDefaultVersionProps
  }
}
