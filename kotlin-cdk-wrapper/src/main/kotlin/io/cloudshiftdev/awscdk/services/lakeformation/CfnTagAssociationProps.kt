@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTagAssociation`.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.S3Table;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.Database;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.DataFormat;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.Schema;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnDataLakeSettings;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTag;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTagAssociation;
 * Stack stack;
 * String accountId;
 * String tagKey = "aws";
 * String[] tagValues = List.of("dev");
 * Database database = new Database(this, "Database");
 * S3Table table = S3Table.Builder.create(this, "Table")
 * .database(database)
 * .columns(List.of(Column.builder()
 * .name("col1")
 * .type(Schema.STRING)
 * .build(), Column.builder()
 * .name("col2")
 * .type(Schema.STRING)
 * .build()))
 * .dataFormat(DataFormat.CSV)
 * .build();
 * DefaultStackSynthesizer synthesizer = (DefaultStackSynthesizer)stack.getSynthesizer();
 * CfnDataLakeSettings.Builder.create(this, "DataLakeSettings")
 * .admins(List.of(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier(stack.formatArn(ArnComponents.builder()
 * .service("iam")
 * .resource("role")
 * .region("")
 * .account(accountId)
 * .resourceName("Admin")
 * .build()))
 * .build(), DataLakePrincipalProperty.builder()
 * // The CDK cloudformation execution role.
 * .dataLakePrincipalIdentifier(synthesizer.cloudFormationExecutionRoleArn.replace("${AWS::Partition}",
 * "aws"))
 * .build()))
 * .build();
 * CfnTag tag = CfnTag.Builder.create(this, "Tag")
 * .catalogId(accountId)
 * .tagKey(tagKey)
 * .tagValues(tagValues)
 * .build();
 * LFTagPairProperty lfTagPairProperty = LFTagPairProperty.builder()
 * .catalogId(accountId)
 * .tagKey(tagKey)
 * .tagValues(tagValues)
 * .build();
 * CfnTagAssociation tagAssociation = CfnTagAssociation.Builder.create(this, "TagAssociation")
 * .lfTags(List.of(lfTagPairProperty))
 * .resource(ResourceProperty.builder()
 * .tableWithColumns(TableWithColumnsResourceProperty.builder()
 * .databaseName(database.getDatabaseName())
 * .columnNames(List.of("col1", "col2"))
 * .catalogId(accountId)
 * .name(table.getTableName())
 * .build())
 * .build())
 * .build();
 * tagAssociation.node.addDependency(tag);
 * tagAssociation.node.addDependency(table);
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html)
 */
public interface CfnTagAssociationProps {
  /**
   * A structure containing an LF-tag key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
   */
  public fun lfTags(): Any

  /**
   * UTF-8 string (valid values: `DATABASE | TABLE` ).
   *
   * The resource for which the LF-tag policy applies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
   */
  public fun resource(): Any

  /**
   * A builder for [CfnTagAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(lfTags: IResolvable)

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(lfTags: List<Any>)

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(vararg lfTags: Any)

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    public fun resource(resource: IResolvable)

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    public fun resource(resource: CfnTagAssociation.ResourceProperty)

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cb3ccafffe663fac54400701dd637c69bc7557ba70562585034caeca7a270d4")
    public fun resource(resource: CfnTagAssociation.ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps.builder()

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(lfTags: IResolvable) {
      cdkBuilder.lfTags(lfTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(lfTags: List<Any>) {
      cdkBuilder.lfTags(lfTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(vararg lfTags: Any): Unit = lfTags(lfTags.toList())

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    override fun resource(resource: CfnTagAssociation.ResourceProperty) {
      cdkBuilder.resource(resource.let(CfnTagAssociation.ResourceProperty.Companion::unwrap))
    }

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     * The resource for which the LF-tag policy applies.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cb3ccafffe663fac54400701dd637c69bc7557ba70562585034caeca7a270d4")
    override fun resource(resource: CfnTagAssociation.ResourceProperty.Builder.() -> Unit): Unit =
        resource(CfnTagAssociation.ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps,
  ) : CdkObject(cdkObject),
      CfnTagAssociationProps {
    /**
     * A structure containing an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
     */
    override fun lfTags(): Any = unwrap(this).getLfTags()

    /**
     * UTF-8 string (valid values: `DATABASE | TABLE` ).
     *
     * The resource for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
     */
    override fun resource(): Any = unwrap(this).getResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps):
        CfnTagAssociationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTagAssociationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagAssociationProps):
        software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps
  }
}
