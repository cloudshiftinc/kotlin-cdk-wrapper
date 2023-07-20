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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserProfile.Builder = CfnUserProfile.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
    }

    public fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String) {
        cdkBuilder.singleSignOnUserIdentifier(singleSignOnUserIdentifier)
    }

    public fun singleSignOnUserValue(singleSignOnUserValue: String) {
        cdkBuilder.singleSignOnUserValue(singleSignOnUserValue)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun userProfileName(userProfileName: String) {
        cdkBuilder.userProfileName(userProfileName)
    }

    public fun userSettings(userSettings: IResolvable) {
        cdkBuilder.userSettings(userSettings)
    }

    public fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty) {
        cdkBuilder.userSettings(userSettings)
    }

    public fun build(): CfnUserProfile {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
