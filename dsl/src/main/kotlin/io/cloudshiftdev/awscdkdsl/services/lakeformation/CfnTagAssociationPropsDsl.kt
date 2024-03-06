@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnTagAssociation
import software.amazon.awscdk.services.lakeformation.CfnTagAssociationProps

/**
 * Properties for defining a `CfnTagAssociation`.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.glue.alpha.S3Table;
 * import software.amazon.awscdk.services.glue.alpha.Database;
 * import software.amazon.awscdk.services.glue.alpha.DataFormat;
 * import software.amazon.awscdk.services.glue.alpha.Schema;
 * import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings;
 * import software.amazon.awscdk.services.lakeformation.CfnTag;
 * import software.amazon.awscdk.services.lakeformation.CfnTagAssociation;
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
@CdkDslMarker
public class CfnTagAssociationPropsDsl {
    private val cdkBuilder: CfnTagAssociationProps.Builder = CfnTagAssociationProps.builder()

    private val _lfTags: MutableList<Any> = mutableListOf()

    /** @param lfTags A structure containing an LF-tag key-value pair. */
    public fun lfTags(vararg lfTags: Any) {
        _lfTags.addAll(listOf(*lfTags))
    }

    /** @param lfTags A structure containing an LF-tag key-value pair. */
    public fun lfTags(lfTags: Collection<Any>) {
        _lfTags.addAll(lfTags)
    }

    /** @param lfTags A structure containing an LF-tag key-value pair. */
    public fun lfTags(lfTags: IResolvable) {
        cdkBuilder.lfTags(lfTags)
    }

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). The resource for which the
     *   LF-tag policy applies.
     */
    public fun resource(resource: IResolvable) {
        cdkBuilder.resource(resource)
    }

    /**
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). The resource for which the
     *   LF-tag policy applies.
     */
    public fun resource(resource: CfnTagAssociation.ResourceProperty) {
        cdkBuilder.resource(resource)
    }

    public fun build(): CfnTagAssociationProps {
        if (_lfTags.isNotEmpty()) cdkBuilder.lfTags(_lfTags)
        return cdkBuilder.build()
    }
}
