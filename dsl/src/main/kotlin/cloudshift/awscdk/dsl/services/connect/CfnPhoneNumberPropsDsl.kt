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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnPhoneNumberProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPhoneNumberPropsDsl {
    private val cdkBuilder: CfnPhoneNumberProps.Builder = CfnPhoneNumberProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun countryCode(countryCode: String) {
        cdkBuilder.countryCode(countryCode)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPhoneNumberProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
