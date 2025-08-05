@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3tables

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnNamespace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3tables.*;
 * CfnNamespaceProps cfnNamespaceProps = CfnNamespaceProps.builder()
 * .namespace("namespace")
 * .tableBucketArn("tableBucketArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html)
 */
public interface CfnNamespaceProps {
  /**
   * The name of the namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html#cfn-s3tables-namespace-namespace)
   */
  public fun namespace(): String

  /**
   * The Amazon Resource Name (ARN) of the specified table bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html#cfn-s3tables-namespace-tablebucketarn)
   */
  public fun tableBucketArn(): String

  /**
   * A builder for [CfnNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param namespace The name of the namespace. 
     */
    public fun namespace(namespace: String)

    /**
     * @param tableBucketArn The Amazon Resource Name (ARN) of the specified table bucket. 
     */
    public fun tableBucketArn(tableBucketArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3tables.CfnNamespaceProps.Builder =
        software.amazon.awscdk.services.s3tables.CfnNamespaceProps.builder()

    /**
     * @param namespace The name of the namespace. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param tableBucketArn The Amazon Resource Name (ARN) of the specified table bucket. 
     */
    override fun tableBucketArn(tableBucketArn: String) {
      cdkBuilder.tableBucketArn(tableBucketArn)
    }

    public fun build(): software.amazon.awscdk.services.s3tables.CfnNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3tables.CfnNamespaceProps,
  ) : CdkObject(cdkObject),
      CfnNamespaceProps {
    /**
     * The name of the namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html#cfn-s3tables-namespace-namespace)
     */
    override fun namespace(): String = unwrap(this).getNamespace()

    /**
     * The Amazon Resource Name (ARN) of the specified table bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3tables-namespace.html#cfn-s3tables-namespace-tablebucketarn)
     */
    override fun tableBucketArn(): String = unwrap(this).getTableBucketArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3tables.CfnNamespaceProps):
        CfnNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNamespaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNamespaceProps):
        software.amazon.awscdk.services.s3tables.CfnNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3tables.CfnNamespaceProps
  }
}
