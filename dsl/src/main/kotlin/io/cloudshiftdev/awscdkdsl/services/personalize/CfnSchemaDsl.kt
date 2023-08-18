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

package io.cloudshiftdev.awscdkdsl.services.personalize

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.personalize.CfnSchema
import software.constructs.Construct

/**
 * Creates an Amazon Personalize schema from the specified schema string.
 *
 * The schema you create must be in Avro JSON format.
 *
 * Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset
 * type and has a set of required field and keywords. If you are creating a schema for a dataset in
 * a Domain dataset group, you provide the domain of the Domain dataset group. You specify a schema
 * when you call
 * [CreateDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html) .
 *
 * For more information on schemas, see
 * [Datasets and schemas](https://docs.aws.amazon.com/personalize/latest/dg/how-it-works-dataset-schema.html)
 * .
 *
 * **Related
 * APIs** - [ListSchemas](https://docs.aws.amazon.com/personalize/latest/dg/API_ListSchemas.html)
 * * [DescribeSchema](https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSchema.html)
 * * [DeleteSchema](https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteSchema.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * CfnSchema cfnSchema = CfnSchema.Builder.create(this, "MyCfnSchema")
 * .name("name")
 * .schema("schema")
 * // the properties below are optional
 * .domain("domain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html)
 */
@CdkDslMarker
public class CfnSchemaDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchema.Builder = CfnSchema.Builder.create(scope, id)

    /**
     * The domain of a schema that you created for a dataset in a Domain dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-domain)
     *
     * @param domain The domain of a schema that you created for a dataset in a Domain dataset
     *   group.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-name)
     *
     * @param name The name of the schema.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-schema)
     *
     * @param schema The schema.
     */
    public fun schema(schema: String) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnSchema = cdkBuilder.build()
}
