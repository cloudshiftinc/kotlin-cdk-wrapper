@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new maintenance configuration or replaces an existing table policy for a table.
 *
 * For more information, see [Adding a table
 * policy](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-tables-table-policy.html#table-policy-add)
 * in the *Amazon Simple Storage Service User Guide* .
 *
 * * **Permissions** - You must have the `s3tables:PutTablePolicy` permission to use this operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * Object resourcePolicy;
 * CfnTablePolicy cfnTablePolicy = CfnTablePolicy.Builder.create(this, "MyCfnTablePolicy")
 * .resourcePolicy(resourcePolicy)
 * .tableArn("tableArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html)
 */
public open class CfnTablePolicy(
  cdkObject: software.amazon.awscdk.services.s3tables.CfnTablePolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTablePolicyProps,
  ) :
      this(software.amazon.awscdk.services.s3tables.CfnTablePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTablePolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTablePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTablePolicyProps(props)
  )

  /**
   * The namespace that the table belongs to.
   */
  public open fun attrNamespace(): String = unwrap(this).getAttrNamespace()

  /**
   * The Amazon Resource Name (ARN) of the specified table bucket.
   */
  public open fun attrTableBucketArn(): String = unwrap(this).getAttrTableBucketArn()

  /**
   * The name for the table.
   */
  public open fun attrTableName(): String = unwrap(this).getAttrTableName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun resourcePolicy(): Any = unwrap(this).getResourcePolicy()

  /**
   *
   */
  public open fun resourcePolicy(`value`: Any) {
    unwrap(this).setResourcePolicy(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the specified table.
   */
  public open fun tableArn(): String = unwrap(this).getTableArn()

  /**
   * The Amazon Resource Name (ARN) of the specified table.
   */
  public open fun tableArn(`value`: String) {
    unwrap(this).setTableArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3tables.CfnTablePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html#cfn-s3tables-tablepolicy-resourcepolicy)
     * @param resourcePolicy 
     */
    public fun resourcePolicy(resourcePolicy: Any)

    /**
     * The Amazon Resource Name (ARN) of the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html#cfn-s3tables-tablepolicy-tablearn)
     * @param tableArn The Amazon Resource Name (ARN) of the specified table. 
     */
    public fun tableArn(tableArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnTablePolicy.Builder =
        software.amazon.awscdk.services.s3tables.CfnTablePolicy.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html#cfn-s3tables-tablepolicy-resourcepolicy)
     * @param resourcePolicy 
     */
    override fun resourcePolicy(resourcePolicy: Any) {
      cdkBuilder.resourcePolicy(resourcePolicy)
    }

    /**
     * The Amazon Resource Name (ARN) of the specified table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-tablepolicy.html#cfn-s3tables-tablepolicy-tablearn)
     * @param tableArn The Amazon Resource Name (ARN) of the specified table. 
     */
    override fun tableArn(tableArn: String) {
      cdkBuilder.tableArn(tableArn)
    }

    public fun build(): software.amazon.awscdk.services.s3tables.CfnTablePolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3tables.CfnTablePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTablePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTablePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnTablePolicy):
        CfnTablePolicy = CfnTablePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnTablePolicy):
        software.amazon.awscdk.services.s3tables.CfnTablePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.s3tables.CfnTablePolicy
  }
}
