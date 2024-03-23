@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the default version of a resource.
 *
 * The default version of a resource will be used in CloudFormation operations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudformation.*;
 * CfnResourceDefaultVersion cfnResourceDefaultVersion =
 * CfnResourceDefaultVersion.Builder.create(this, "MyCfnResourceDefaultVersion")
 * .typeName("typeName")
 * .typeVersionArn("typeVersionArn")
 * .versionId("versionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html)
 */
public open class CfnResourceDefaultVersion(
  cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion,
) : CfnResource(cdkObject), IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceDefaultVersionProps,
  ) :
      this(software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnResourceDefaultVersionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceDefaultVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceDefaultVersionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the resource.
   */
  public open fun typeName(): String? = unwrap(this).getTypeName()

  /**
   * The name of the resource.
   */
  public open fun typeName(`value`: String) {
    unwrap(this).setTypeName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the resource version.
   */
  public open fun typeVersionArn(): String? = unwrap(this).getTypeVersionArn()

  /**
   * The Amazon Resource Name (ARN) of the resource version.
   */
  public open fun typeVersionArn(`value`: String) {
    unwrap(this).setTypeVersionArn(`value`)
  }

  /**
   * The ID of a specific version of the resource.
   */
  public open fun versionId(): String? = unwrap(this).getVersionId()

  /**
   * The ID of a specific version of the resource.
   */
  public open fun versionId(`value`: String) {
    unwrap(this).setVersionId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cloudformation.CfnResourceDefaultVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the resource.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typename)
     * @param typeName The name of the resource. 
     */
    public fun typeName(typeName: String)

    /**
     * The Amazon Resource Name (ARN) of the resource version.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typeversionarn)
     * @param typeVersionArn The Amazon Resource Name (ARN) of the resource version. 
     */
    public fun typeVersionArn(typeVersionArn: String)

    /**
     * The ID of a specific version of the resource.
     *
     * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
     * resource version when it's registered.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-versionid)
     * @param versionId The ID of a specific version of the resource. 
     */
    public fun versionId(versionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion.Builder =
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion.Builder.create(scope,
        id)

    /**
     * The name of the resource.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typename)
     * @param typeName The name of the resource. 
     */
    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    /**
     * The Amazon Resource Name (ARN) of the resource version.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-typeversionarn)
     * @param typeVersionArn The Amazon Resource Name (ARN) of the resource version. 
     */
    override fun typeVersionArn(typeVersionArn: String) {
      cdkBuilder.typeVersionArn(typeVersionArn)
    }

    /**
     * The ID of a specific version of the resource.
     *
     * The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the
     * resource version when it's registered.
     *
     * Conditional: You must specify either `TypeVersionArn` , or `TypeName` and `VersionId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-resourcedefaultversion.html#cfn-cloudformation-resourcedefaultversion-versionid)
     * @param versionId The ID of a specific version of the resource. 
     */
    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceDefaultVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceDefaultVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion):
        CfnResourceDefaultVersion = CfnResourceDefaultVersion(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefaultVersion):
        software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion = wrapped.cdkObject
        as software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion
  }
}
