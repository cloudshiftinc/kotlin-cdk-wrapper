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

package cloudshift.awscdk.dsl.services.ram

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ram.CfnResourceShareProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceSharePropsDsl {
    private val cdkBuilder: CfnResourceShareProps.Builder = CfnResourceShareProps.builder()

    private val _permissionArns: MutableList<String> = mutableListOf()

    private val _principals: MutableList<String> = mutableListOf()

    private val _resourceArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun allowExternalPrincipals(allowExternalPrincipals: Boolean) {
        cdkBuilder.allowExternalPrincipals(allowExternalPrincipals)
    }

    public fun allowExternalPrincipals(allowExternalPrincipals: IResolvable) {
        cdkBuilder.allowExternalPrincipals(allowExternalPrincipals)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun permissionArns(vararg permissionArns: String) {
        _permissionArns.addAll(listOf(*permissionArns))
    }

    public fun permissionArns(permissionArns: Collection<String>) {
        _permissionArns.addAll(permissionArns)
    }

    public fun principals(vararg principals: String) {
        _principals.addAll(listOf(*principals))
    }

    public fun principals(principals: Collection<String>) {
        _principals.addAll(principals)
    }

    public fun resourceArns(vararg resourceArns: String) {
        _resourceArns.addAll(listOf(*resourceArns))
    }

    public fun resourceArns(resourceArns: Collection<String>) {
        _resourceArns.addAll(resourceArns)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResourceShareProps {
        if (_permissionArns.isNotEmpty()) cdkBuilder.permissionArns(_permissionArns)
        if (_principals.isNotEmpty()) cdkBuilder.principals(_principals)
        if (_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
