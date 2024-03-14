package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRecoveryGroupProps {
  /**
   * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-cells)
   */
  public fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

  /**
   * The name of the recovery group to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-recoverygroupname)
   */
  public fun recoveryGroupName(): String? = unwrap(this).getRecoveryGroupName()

  /**
   * A collection of tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRecoveryGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     */
    public fun cells(cells: List<String>)

    /**
     * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     */
    public fun cells(vararg cells: String)

    /**
     * @param recoveryGroupName The name of the recovery group to create.
     */
    public fun recoveryGroupName(recoveryGroupName: String)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of tags associated with a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps.builder()

    /**
     * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     */
    override fun cells(cells: List<String>) {
      cdkBuilder.cells(cells)
    }

    /**
     * @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     */
    override fun cells(vararg cells: String): Unit = cells(cells.toList())

    /**
     * @param recoveryGroupName The name of the recovery group to create.
     */
    override fun recoveryGroupName(recoveryGroupName: String) {
      cdkBuilder.recoveryGroupName(recoveryGroupName)
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A collection of tags associated with a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps,
  ) : CdkObject(cdkObject), CfnRecoveryGroupProps {
    /**
     * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-cells)
     */
    override fun cells(): List<String> = unwrap(this).getCells() ?: emptyList()

    /**
     * The name of the recovery group to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-recoverygroupname)
     */
    override fun recoveryGroupName(): String? = unwrap(this).getRecoveryGroupName()

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html#cfn-route53recoveryreadiness-recoverygroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecoveryGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps):
        CfnRecoveryGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecoveryGroupProps):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps
  }
}
