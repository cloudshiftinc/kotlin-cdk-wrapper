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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

/**
 * A top level `ProductViewDetail` response containing details about the product’s connection.
 *
 * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
 * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
 * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * SourceConnectionProperty sourceConnectionProperty = SourceConnectionProperty.builder()
 * .connectionParameters(ConnectionParametersProperty.builder()
 * .codeStar(CodeStarParametersProperty.builder()
 * .artifactPath("artifactPath")
 * .branch("branch")
 * .connectionArn("connectionArn")
 * .repository("repository")
 * .build())
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-sourceconnection.html)
 */
@CdkDslMarker
public class CfnCloudFormationProductSourceConnectionPropertyDsl {
    private val cdkBuilder: CfnCloudFormationProduct.SourceConnectionProperty.Builder =
        CfnCloudFormationProduct.SourceConnectionProperty.builder()

    /** @param connectionParameters The connection details based on the connection `Type` . */
    public fun connectionParameters(connectionParameters: IResolvable) {
        cdkBuilder.connectionParameters(connectionParameters)
    }

    /** @param connectionParameters The connection details based on the connection `Type` . */
    public fun connectionParameters(
        connectionParameters: CfnCloudFormationProduct.ConnectionParametersProperty
    ) {
        cdkBuilder.connectionParameters(connectionParameters)
    }

    /** @param type The only supported `SourceConnection` type is Codestar. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCloudFormationProduct.SourceConnectionProperty = cdkBuilder.build()
}
