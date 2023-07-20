@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfileProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConfigurationProfilePropsDsl {
    private val cdkBuilder: CfnConfigurationProfileProps.Builder =
        CfnConfigurationProfileProps.builder()

    private val _tags: MutableList<CfnConfigurationProfile.TagsProperty> = mutableListOf()

    private val _validators: MutableList<Any> = mutableListOf()

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun locationUri(locationUri: String) {
        cdkBuilder.locationUri(locationUri)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun retrievalRoleArn(retrievalRoleArn: String) {
        cdkBuilder.retrievalRoleArn(retrievalRoleArn)
    }

    public fun tags(tags: CfnConfigurationProfileTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnConfigurationProfileTagsPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnConfigurationProfile.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun validators(vararg validators: Any) {
        _validators.addAll(listOf(*validators))
    }

    public fun validators(validators: Collection<Any>) {
        _validators.addAll(validators)
    }

    public fun validators(validators: IResolvable) {
        cdkBuilder.validators(validators)
    }

    public fun build(): CfnConfigurationProfileProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_validators.isNotEmpty()) cdkBuilder.validators(_validators)
        return cdkBuilder.build()
    }
}
