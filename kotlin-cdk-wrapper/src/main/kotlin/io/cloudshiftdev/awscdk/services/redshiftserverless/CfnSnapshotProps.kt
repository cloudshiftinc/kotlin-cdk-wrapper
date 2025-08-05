@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSnapshot`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
 * CfnSnapshotProps cfnSnapshotProps = CfnSnapshotProps.builder()
 * .snapshotName("snapshotName")
 * // the properties below are optional
 * .namespaceName("namespaceName")
 * .retentionPeriod(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html)
 */
public interface CfnSnapshotProps {
  /**
   * The name of the namepsace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-namespacename)
   */
  public fun namespaceName(): String? = unwrap(this).getNamespaceName()

  /**
   * The retention period of the snapshot created by the scheduled action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-retentionperiod)
   */
  public fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

  /**
   * The name of the snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-snapshotname)
   */
  public fun snapshotName(): String

  /**
   * An array of [Tag
   * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
   * associate with the snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSnapshotProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param namespaceName The name of the namepsace.
     */
    public fun namespaceName(namespaceName: String)

    /**
     * @param retentionPeriod The retention period of the snapshot created by the scheduled action.
     */
    public fun retentionPeriod(retentionPeriod: Number)

    /**
     * @param snapshotName The name of the snapshot. 
     */
    public fun snapshotName(snapshotName: String)

    /**
     * @param tags An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshiftserverless.CfnSnapshotProps.Builder =
        software.amazon.awscdk.services.redshiftserverless.CfnSnapshotProps.builder()

    /**
     * @param namespaceName The name of the namepsace.
     */
    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * @param retentionPeriod The retention period of the snapshot created by the scheduled action.
     */
    override fun retentionPeriod(retentionPeriod: Number) {
      cdkBuilder.retentionPeriod(retentionPeriod)
    }

    /**
     * @param snapshotName The name of the snapshot. 
     */
    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * @param tags An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnSnapshotProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnSnapshotProps,
  ) : CdkObject(cdkObject),
      CfnSnapshotProps {
    /**
     * The name of the namepsace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-namespacename)
     */
    override fun namespaceName(): String? = unwrap(this).getNamespaceName()

    /**
     * The retention period of the snapshot created by the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-retentionperiod)
     */
    override fun retentionPeriod(): Number? = unwrap(this).getRetentionPeriod()

    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-snapshotname)
     */
    override fun snapshotName(): String = unwrap(this).getSnapshotName()

    /**
     * An array of [Tag
     * objects](https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html) to
     * associate with the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-snapshot.html#cfn-redshiftserverless-snapshot-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSnapshotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnSnapshotProps):
        CfnSnapshotProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSnapshotProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSnapshotProps):
        software.amazon.awscdk.services.redshiftserverless.CfnSnapshotProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshiftserverless.CfnSnapshotProps
  }
}
