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

package io.cloudshiftdev.awscdkdsl.customresources

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.customresources.SdkCallsPolicyOptions

/**
 * Options for the auto-generation of policies based on the configured SDK calls.
 *
 * Example:
 * ```
 * AwsCustomResource getParameter = AwsCustomResource.Builder.create(this, "GetParameter")
 * .onUpdate(AwsSdkCall.builder() // will also be called for a CREATE event
 * .service("SSM")
 * .action("getParameter")
 * .parameters(Map.of(
 * "Name", "my-parameter",
 * "WithDecryption", true))
 * .physicalResourceId(PhysicalResourceId.of(Date.now().toString())).build())
 * .policy(AwsCustomResourcePolicy.fromSdkCalls(SdkCallsPolicyOptions.builder()
 * .resources(AwsCustomResourcePolicy.ANY_RESOURCE)
 * .build()))
 * .build();
 * // Use the value in another construct with
 * getParameter.getResponseField("Parameter.Value");
 * ```
 */
@CdkDslMarker
public class SdkCallsPolicyOptionsDsl {
    private val cdkBuilder: SdkCallsPolicyOptions.Builder = SdkCallsPolicyOptions.builder()

    private val _resources: MutableList<String> = mutableListOf()

    /**
     * @param resources The resources that the calls will have access to. It is best to use specific
     *   resource ARN's when possible. However, you can also use
     *   `AwsCustomResourcePolicy.ANY_RESOURCE` to allow access to all resources. For example, when
     *   `onCreate` is used to create a resource which you don't know the physical name of in
     *   advance.
     *
     * Note that will apply to ALL SDK calls.
     */
    public fun resources(vararg resources: String) {
        _resources.addAll(listOf(*resources))
    }

    /**
     * @param resources The resources that the calls will have access to. It is best to use specific
     *   resource ARN's when possible. However, you can also use
     *   `AwsCustomResourcePolicy.ANY_RESOURCE` to allow access to all resources. For example, when
     *   `onCreate` is used to create a resource which you don't know the physical name of in
     *   advance.
     *
     * Note that will apply to ALL SDK calls.
     */
    public fun resources(resources: Collection<String>) {
        _resources.addAll(resources)
    }

    public fun build(): SdkCallsPolicyOptions {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        return cdkBuilder.build()
    }
}
