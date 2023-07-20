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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnApplication
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _attributesToDelete: MutableList<String> = mutableListOf()

    private val _instanceFamilies: MutableList<String> = mutableListOf()

    private val _platforms: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun appBlockArn(appBlockArn: String) {
        cdkBuilder.appBlockArn(appBlockArn)
    }

    public fun attributesToDelete(vararg attributesToDelete: String) {
        _attributesToDelete.addAll(listOf(*attributesToDelete))
    }

    public fun attributesToDelete(attributesToDelete: Collection<String>) {
        _attributesToDelete.addAll(attributesToDelete)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun iconS3Location(iconS3Location: IResolvable) {
        cdkBuilder.iconS3Location(iconS3Location)
    }

    public fun iconS3Location(iconS3Location: CfnApplication.S3LocationProperty) {
        cdkBuilder.iconS3Location(iconS3Location)
    }

    public fun instanceFamilies(vararg instanceFamilies: String) {
        _instanceFamilies.addAll(listOf(*instanceFamilies))
    }

    public fun instanceFamilies(instanceFamilies: Collection<String>) {
        _instanceFamilies.addAll(instanceFamilies)
    }

    public fun launchParameters(launchParameters: String) {
        cdkBuilder.launchParameters(launchParameters)
    }

    public fun launchPath(launchPath: String) {
        cdkBuilder.launchPath(launchPath)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun platforms(vararg platforms: String) {
        _platforms.addAll(listOf(*platforms))
    }

    public fun platforms(platforms: Collection<String>) {
        _platforms.addAll(platforms)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CfnApplication {
        if (_attributesToDelete.isNotEmpty()) cdkBuilder.attributesToDelete(_attributesToDelete)
        if (_instanceFamilies.isNotEmpty()) cdkBuilder.instanceFamilies(_instanceFamilies)
        if (_platforms.isNotEmpty()) cdkBuilder.platforms(_platforms)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
