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

package io.cloudshiftdev.awscdkdsl.services.location

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.location.CfnAPIKey

/**
 * API Restrictions on the allowed actions, resources, and referers for an API key resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * ApiKeyRestrictionsProperty apiKeyRestrictionsProperty = ApiKeyRestrictionsProperty.builder()
 * .allowActions(List.of("allowActions"))
 * .allowResources(List.of("allowResources"))
 * // the properties below are optional
 * .allowReferers(List.of("allowReferers"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-apikey-apikeyrestrictions.html)
 */
@CdkDslMarker
public class CfnAPIKeyApiKeyRestrictionsPropertyDsl {
    private val cdkBuilder: CfnAPIKey.ApiKeyRestrictionsProperty.Builder =
        CfnAPIKey.ApiKeyRestrictionsProperty.builder()

    private val _allowActions: MutableList<String> = mutableListOf()

    private val _allowReferers: MutableList<String> = mutableListOf()

    private val _allowResources: MutableList<String> = mutableListOf()

    /**
     * @param allowActions A list of allowed actions that an API key resource grants permissions to
     *   perform. You must have at least one action for each type of resource. For example, if you
     *   have a place resource, you must include at least one place action.
     *
     * The following are valid values for the actions.
     * * *Map actions*
     * * `geo:GetMap*` - Allows all actions needed for map rendering.
     * * *Place actions*
     * * `geo:SearchPlaceIndexForText` - Allows geocoding.
     * * `geo:SearchPlaceIndexForPosition` - Allows reverse geocoding.
     * * `geo:SearchPlaceIndexForSuggestions` - Allows generating suggestions from text.
     * * `geo:GetPlace` - Allows finding a place by place ID.
     * * *Route actions*
     * * `geo:CalculateRoute` - Allows point to point routing.
     * * `geo:CalculateRouteMatrix` - Allows calculating a matrix of routes.
     *
     * You must use these strings exactly. For example, to provide access to map rendering, the only
     * valid action is `geo:GetMap*` as an input to the list. `["geo:GetMap*"]` is valid but
     * `["geo:GetMapTile"]` is not. Similarly, you cannot use `["geo:SearchPlaceIndexFor*"]` - you
     * must list each of the Place actions separately.
     */
    public fun allowActions(vararg allowActions: String) {
        _allowActions.addAll(listOf(*allowActions))
    }

    /**
     * @param allowActions A list of allowed actions that an API key resource grants permissions to
     *   perform. You must have at least one action for each type of resource. For example, if you
     *   have a place resource, you must include at least one place action.
     *
     * The following are valid values for the actions.
     * * *Map actions*
     * * `geo:GetMap*` - Allows all actions needed for map rendering.
     * * *Place actions*
     * * `geo:SearchPlaceIndexForText` - Allows geocoding.
     * * `geo:SearchPlaceIndexForPosition` - Allows reverse geocoding.
     * * `geo:SearchPlaceIndexForSuggestions` - Allows generating suggestions from text.
     * * `geo:GetPlace` - Allows finding a place by place ID.
     * * *Route actions*
     * * `geo:CalculateRoute` - Allows point to point routing.
     * * `geo:CalculateRouteMatrix` - Allows calculating a matrix of routes.
     *
     * You must use these strings exactly. For example, to provide access to map rendering, the only
     * valid action is `geo:GetMap*` as an input to the list. `["geo:GetMap*"]` is valid but
     * `["geo:GetMapTile"]` is not. Similarly, you cannot use `["geo:SearchPlaceIndexFor*"]` - you
     * must list each of the Place actions separately.
     */
    public fun allowActions(allowActions: Collection<String>) {
        _allowActions.addAll(allowActions)
    }

    /**
     * @param allowReferers An optional list of allowed HTTP referers for which requests must
     *   originate from. Requests using this API key from other domains will not be allowed.
     *
     * Requirements:
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list
     *   `$\-._+!*`(),;/?:&#64;=&amp;`
     * * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is used
     *   for URL encoding purposes.
     * * May contain wildcard characters question mark (?) and asterisk (*).
     *
     * Question mark (?) will replace any single character (including hexadecimal digits).
     *
     * Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).
     * * No spaces allowed. For example, `https://example.com` .
     */
    public fun allowReferers(vararg allowReferers: String) {
        _allowReferers.addAll(listOf(*allowReferers))
    }

    /**
     * @param allowReferers An optional list of allowed HTTP referers for which requests must
     *   originate from. Requests using this API key from other domains will not be allowed.
     *
     * Requirements:
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list
     *   `$\-._+!*`(),;/?:&#64;=&amp;`
     * * May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is used
     *   for URL encoding purposes.
     * * May contain wildcard characters question mark (?) and asterisk (*).
     *
     * Question mark (?) will replace any single character (including hexadecimal digits).
     *
     * Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).
     * * No spaces allowed. For example, `https://example.com` .
     */
    public fun allowReferers(allowReferers: Collection<String>) {
        _allowReferers.addAll(allowReferers)
    }

    /**
     * @param allowResources A list of allowed resource ARNs that a API key bearer can perform
     *   actions on.
     * * The ARN must be the correct ARN for a map, place, or route ARN. You may include wildcards
     *   in the resource-id to match multiple resources of the same type.
     * * The resources must be in the same `partition` , `region` , and `account-id` as the key that
     *   is being created.
     * * Other than wildcards, you must include the full ARN, including the `arn` , `partition` ,
     *   `service` , `region` , `account-id` and `resource-id` delimited by colons (:).
     * * No spaces allowed, even with wildcards. For example, `arn:aws:geo:region: *account-id*
     *   :map/ExampleMap*` .
     *
     * For more information about ARN format, see
     * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     * .
     */
    public fun allowResources(vararg allowResources: String) {
        _allowResources.addAll(listOf(*allowResources))
    }

    /**
     * @param allowResources A list of allowed resource ARNs that a API key bearer can perform
     *   actions on.
     * * The ARN must be the correct ARN for a map, place, or route ARN. You may include wildcards
     *   in the resource-id to match multiple resources of the same type.
     * * The resources must be in the same `partition` , `region` , and `account-id` as the key that
     *   is being created.
     * * Other than wildcards, you must include the full ARN, including the `arn` , `partition` ,
     *   `service` , `region` , `account-id` and `resource-id` delimited by colons (:).
     * * No spaces allowed, even with wildcards. For example, `arn:aws:geo:region: *account-id*
     *   :map/ExampleMap*` .
     *
     * For more information about ARN format, see
     * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     * .
     */
    public fun allowResources(allowResources: Collection<String>) {
        _allowResources.addAll(allowResources)
    }

    public fun build(): CfnAPIKey.ApiKeyRestrictionsProperty {
        if (_allowActions.isNotEmpty()) cdkBuilder.allowActions(_allowActions)
        if (_allowReferers.isNotEmpty()) cdkBuilder.allowReferers(_allowReferers)
        if (_allowResources.isNotEmpty()) cdkBuilder.allowResources(_allowResources)
        return cdkBuilder.build()
    }
}
