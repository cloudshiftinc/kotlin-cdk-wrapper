@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a namespace.
 *
 * A namespace is a logical grouping of tables within your table bucket, which you can use to
 * organize tables. For more information, see [Create a
 * namespace](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-tables-namespace-create.html) in
 * the *Amazon Simple Storage Service User Guide* .
 *
 * * **Permissions** - You must have the `s3tables:CreateNamespace` permission to use this
 * operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * CfnNamespace cfnNamespace = CfnNamespace.Builder.create(this, "MyCfnNamespace")
 * .namespace("namespace")
 * .tableBucketArn("tableBucketArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html)
 */
public open class CfnNamespace(
  cdkObject: software.amazon.awscdk.services.s3tables.CfnNamespace,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNamespaceProps,
  ) :
      this(software.amazon.awscdk.services.s3tables.CfnNamespace(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNamespaceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNamespaceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNamespaceProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the namespace.
   */
  public open fun namespace(): String = unwrap(this).getNamespace()

  /**
   * The name of the namespace.
   */
  public open fun namespace(`value`: String) {
    unwrap(this).setNamespace(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the specified table bucket.
   */
  public open fun tableBucketArn(): String = unwrap(this).getTableBucketArn()

  /**
   * The Amazon Resource Name (ARN) of the specified table bucket.
   */
  public open fun tableBucketArn(`value`: String) {
    unwrap(this).setTableBucketArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3tables.CfnNamespace].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html#cfn-s3tables-namespace-namespace)
     * @param namespace The name of the namespace. 
     */
    public fun namespace(namespace: String)

    /**
     * The Amazon Resource Name (ARN) of the specified table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html#cfn-s3tables-namespace-tablebucketarn)
     * @param tableBucketArn The Amazon Resource Name (ARN) of the specified table bucket. 
     */
    public fun tableBucketArn(tableBucketArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnNamespace.Builder =
        software.amazon.awscdk.services.s3tables.CfnNamespace.Builder.create(scope, id)

    /**
     * The name of the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html#cfn-s3tables-namespace-namespace)
     * @param namespace The name of the namespace. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * The Amazon Resource Name (ARN) of the specified table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html#cfn-s3tables-namespace-tablebucketarn)
     * @param tableBucketArn The Amazon Resource Name (ARN) of the specified table bucket. 
     */
    override fun tableBucketArn(tableBucketArn: String) {
      cdkBuilder.tableBucketArn(tableBucketArn)
    }

    public fun build(): software.amazon.awscdk.services.s3tables.CfnNamespace = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3tables.CfnNamespace.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnNamespace):
        CfnNamespace = CfnNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnNamespace):
        software.amazon.awscdk.services.s3tables.CfnNamespace = wrapped.cdkObject as
        software.amazon.awscdk.services.s3tables.CfnNamespace
  }
}
