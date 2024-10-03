@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBClusterParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.docdb.*;
 * Object parameters;
 * CfnDBClusterParameterGroupProps cfnDBClusterParameterGroupProps =
 * CfnDBClusterParameterGroupProps.builder()
 * .description("description")
 * .family("family")
 * .parameters(parameters)
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html)
 */
public interface CfnDBClusterParameterGroupProps {
  /**
   * The description for the cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-description)
   */
  public fun description(): String

  /**
   * The cluster parameter group family name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-family)
   */
  public fun family(): String

  /**
   * The name of the DB cluster parameter group.
   *
   * Constraints:
   *
   * * Must not match the name of an existing `DBClusterParameterGroup` .
   *
   *
   * This value is stored as a lowercase string.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Provides a list of parameters for the cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-parameters)
   */
  public fun parameters(): Any

  /**
   * The tags to be assigned to the cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBClusterParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description for the cluster parameter group. 
     */
    public fun description(description: String)

    /**
     * @param family The cluster parameter group family name. 
     */
    public fun family(family: String)

    /**
     * @param name The name of the DB cluster parameter group.
     * Constraints:
     *
     * * Must not match the name of an existing `DBClusterParameterGroup` .
     *
     *
     * This value is stored as a lowercase string.
     */
    public fun name(name: String)

    /**
     * @param parameters Provides a list of parameters for the cluster parameter group. 
     */
    public fun parameters(parameters: Any)

    /**
     * @param tags The tags to be assigned to the cluster parameter group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to be assigned to the cluster parameter group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.Builder =
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps.builder()

    /**
     * @param description The description for the cluster parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param family The cluster parameter group family name. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param name The name of the DB cluster parameter group.
     * Constraints:
     *
     * * Must not match the name of an existing `DBClusterParameterGroup` .
     *
     *
     * This value is stored as a lowercase string.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters Provides a list of parameters for the cluster parameter group. 
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags The tags to be assigned to the cluster parameter group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to be assigned to the cluster parameter group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps,
  ) : CdkObject(cdkObject),
      CfnDBClusterParameterGroupProps {
    /**
     * The description for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The cluster parameter group family name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-family)
     */
    override fun family(): String = unwrap(this).getFamily()

    /**
     * The name of the DB cluster parameter group.
     *
     * Constraints:
     *
     * * Must not match the name of an existing `DBClusterParameterGroup` .
     *
     *
     * This value is stored as a lowercase string.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Provides a list of parameters for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-parameters)
     */
    override fun parameters(): Any = unwrap(this).getParameters()

    /**
     * The tags to be assigned to the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-dbclusterparametergroup.html#cfn-docdb-dbclusterparametergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBClusterParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps):
        CfnDBClusterParameterGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDBClusterParameterGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterParameterGroupProps):
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroupProps
  }
}
