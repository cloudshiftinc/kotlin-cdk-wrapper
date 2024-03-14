package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnResourceDefaultVersionProps {
  /**
   * The name of the resource.
   *
   * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typename)
   */
  public fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * The Amazon Resource Name (ARN) of the resource version.
   *
   * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typeversionarn)
   */
  public fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

  /**
   * The ID of a specific version of the resource.
   *
   * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
   * resource version when it's registered.
   *
   * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-versionid)
   */
  public fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * A builder for [CfnResourceDefaultVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param typeName The name of the resource.
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun typeName(typeName: String)

    /**
     * @param typeVersionArn The Amazon Resource Name (ARN) of the resource version.
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun typeVersionArn(typeVersionArn: String)

    /**
     * @param versionId The ID of a specific version of the resource.
     * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
     * resource version when it's registered.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps.builder()

    /**
     * @param typeName The name of the resource.
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    /**
     * @param typeVersionArn The Amazon Resource Name (ARN) of the resource version.
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    override fun typeVersionArn(typeVersionArn: String) {
      cdkBuilder.typeVersionArn(typeVersionArn)
    }

    /**
     * @param versionId The ID of a specific version of the resource.
     * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
     * resource version when it's registered.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build():
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps,
  ) : CdkObject(cdkObject), CfnResourceDefaultVersionProps {
    /**
     * The name of the resource.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typename)
     */
    override fun typeName(): String? = unwrap(this).getTypeName()

    /**
     * The Amazon Resource Name (ARN) of the resource version.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typeversionarn)
     */
    override fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

    /**
     * The ID of a specific version of the resource.
     *
     * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
     * resource version when it's registered.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-versionid)
     */
    override fun versionId(): String? = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceDefaultVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps):
        CfnResourceDefaultVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefaultVersionProps):
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps
  }
}
