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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.constructs.Construct

/**
 * Definition of AWS::Serverless::SimpleTable.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CfnSimpleTable cfnSimpleTable = CfnSimpleTable.Builder.create(this, "MyCfnSimpleTable")
 * .primaryKey(PrimaryKeyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .provisionedThroughput(ProvisionedThroughputProperty.builder()
 * .writeCapacityUnits(123)
 * // the properties below are optional
 * .readCapacityUnits(123)
 * .build())
 * .sseSpecification(SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * .build())
 * .tableName("tableName")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html)
 */
@CdkDslMarker
public class CfnSimpleTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSimpleTable.Builder = CfnSimpleTable.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     *
     * @param primaryKey
     */
    public fun primaryKey(primaryKey: IResolvable) {
        cdkBuilder.primaryKey(primaryKey)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-primarykey)
     *
     * @param primaryKey
     */
    public fun primaryKey(primaryKey: CfnSimpleTable.PrimaryKeyProperty) {
        cdkBuilder.primaryKey(primaryKey)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     *
     * @param provisionedThroughput
     */
    public fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-provisionedthroughput)
     *
     * @param provisionedThroughput
     */
    public fun provisionedThroughput(
        provisionedThroughput: CfnSimpleTable.ProvisionedThroughputProperty
    ) {
        cdkBuilder.provisionedThroughput(provisionedThroughput)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     *
     * @param sseSpecification
     */
    public fun sseSpecification(sseSpecification: IResolvable) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-ssespecification)
     *
     * @param sseSpecification
     */
    public fun sseSpecification(sseSpecification: CfnSimpleTable.SSESpecificationProperty) {
        cdkBuilder.sseSpecification(sseSpecification)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tablename)
     *
     * @param tableName
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-simpletable.html#cfn-serverless-simpletable-tags)
     *
     * @param tags
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnSimpleTable = cdkBuilder.build()
}
