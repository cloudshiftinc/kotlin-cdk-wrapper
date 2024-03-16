@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnHookDefaultVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnHookDefaultVersionProps cfnHookDefaultVersionProps = CfnHookDefaultVersionProps.builder()
 * .typeName("typeName")
 * .typeVersionArn("typeVersionArn")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html)
 */
public interface CfnHookDefaultVersionProps {
  /**
   * The name of the hook.
   *
   * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typename)
   */
  public fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * The version ID of the type configuration.
   *
   * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typeversionarn)
   */
  public fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

  /**
   * The version ID of the type specified.
   *
   * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-versionid)
   */
  public fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * A builder for [CfnHookDefaultVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param typeName The name of the hook.
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun typeName(typeName: String)

    /**
     * @param typeVersionArn The version ID of the type configuration.
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun typeVersionArn(typeVersionArn: String)

    /**
     * @param versionId The version ID of the type specified.
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    public fun versionId(versionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookDefaultVersionProps.Builder =
        software.amazon.awscdk.CfnHookDefaultVersionProps.builder()

    /**
     * @param typeName The name of the hook.
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    /**
     * @param typeVersionArn The version ID of the type configuration.
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    override fun typeVersionArn(typeVersionArn: String) {
      cdkBuilder.typeVersionArn(typeVersionArn)
    }

    /**
     * @param versionId The version ID of the type specified.
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.CfnHookDefaultVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnHookDefaultVersionProps,
  ) : CdkObject(cdkObject), CfnHookDefaultVersionProps {
    /**
     * The name of the hook.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typename)
     */
    override fun typeName(): String? = unwrap(this).getTypeName()

    /**
     * The version ID of the type configuration.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typeversionarn)
     */
    override fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

    /**
     * The version ID of the type specified.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-versionid)
     */
    override fun versionId(): String? = unwrap(this).getVersionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHookDefaultVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookDefaultVersionProps):
        CfnHookDefaultVersionProps = CdkObjectWrappers.wrap(cdkObject) as CfnHookDefaultVersionProps

    internal fun unwrap(wrapped: CfnHookDefaultVersionProps):
        software.amazon.awscdk.CfnHookDefaultVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnHookDefaultVersionProps
  }
}
