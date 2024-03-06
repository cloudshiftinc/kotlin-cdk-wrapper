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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

/**
 * Contains the GraphQL operation to be parsed and executed, if the event target is an AWS AppSync
 * API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * AppSyncParametersProperty appSyncParametersProperty = AppSyncParametersProperty.builder()
 * .graphQlOperation("graphQlOperation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-appsyncparameters.html)
 */
@CdkDslMarker
public class CfnRuleAppSyncParametersPropertyDsl {
    private val cdkBuilder: CfnRule.AppSyncParametersProperty.Builder =
        CfnRule.AppSyncParametersProperty.builder()

    /**
     * @param graphQlOperation The GraphQL operation; that is, the query, mutation, or subscription
     *   to be parsed and executed by the GraphQL service. For more information, see
     *   [Operations](https://docs.aws.amazon.com/appsync/latest/devguide/graphql-architecture.html#graphql-operations)
     *   in the *AWS AppSync User Guide* .
     */
    public fun graphQlOperation(graphQlOperation: String) {
        cdkBuilder.graphQlOperation(graphQlOperation)
    }

    public fun build(): CfnRule.AppSyncParametersProperty = cdkBuilder.build()
}
