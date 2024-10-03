@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `HookDefaultVersion` resource specifies the default version of the hook.
 *
 * The default version of the hook is used in CloudFormation operations for this AWS account and AWS
 * Region .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnHookDefaultVersion cfnHookDefaultVersion = CfnHookDefaultVersion.Builder.create(this,
 * "MyCfnHookDefaultVersion")
 * .typeName("typeName")
 * .typeVersionArn("typeVersionArn")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html)
 */
public open class CfnHookDefaultVersion(
  cdkObject: software.amazon.awscdk.CfnHookDefaultVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.CfnHookDefaultVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHookDefaultVersionProps,
  ) :
      this(software.amazon.awscdk.CfnHookDefaultVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHookDefaultVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHookDefaultVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnHookDefaultVersionProps(props)
  )

  /**
   * The Amazon Resource Number (ARN) of the activated extension, in this account and Region.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the hook.
   */
  public open fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * The name of the hook.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * The version ID of the type configuration.
   */
  public open fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

  /**
   * The version ID of the type configuration.
   */
  public open fun typeVersionArn(`value`: String) {
    unwrap(this).setTypeVersionArn(`value`)
  }

  /**
   * The version ID of the type specified.
   */
  public open fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * The version ID of the type specified.
   */
  public open fun versionId(`value`: String) {
    unwrap(this).setVersionId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnHookDefaultVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the hook.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typename)
     * @param typeName The name of the hook. 
     */
    public fun typeName(typeName: String)

    /**
     * The version ID of the type configuration.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typeversionarn)
     * @param typeVersionArn The version ID of the type configuration. 
     */
    public fun typeVersionArn(typeVersionArn: String)

    /**
     * The version ID of the type specified.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-versionid)
     * @param versionId The version ID of the type specified. 
     */
    public fun versionId(versionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookDefaultVersion.Builder =
        software.amazon.awscdk.CfnHookDefaultVersion.Builder.create(scope, id)

    /**
     * The name of the hook.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typename)
     * @param typeName The name of the hook. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    /**
     * The version ID of the type configuration.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-typeversionarn)
     * @param typeVersionArn The version ID of the type configuration. 
     */
    override fun typeVersionArn(typeVersionArn: String) {
      cdkBuilder.typeVersionArn(typeVersionArn)
    }

    /**
     * The version ID of the type specified.
     *
     * You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-hookdefaultversion.html#cfn-cloudformation-hookdefaultversion-versionid)
     * @param versionId The version ID of the type specified. 
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.CfnHookDefaultVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnHookDefaultVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHookDefaultVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHookDefaultVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookDefaultVersion):
        CfnHookDefaultVersion = CfnHookDefaultVersion(cdkObject)

    internal fun unwrap(wrapped: CfnHookDefaultVersion):
        software.amazon.awscdk.CfnHookDefaultVersion = wrapped.cdkObject as
        software.amazon.awscdk.CfnHookDefaultVersion
  }
}
