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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnServiceAction
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceActionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServiceAction.Builder = CfnServiceAction.Builder.create(scope, id)

    private val _definition: MutableList<Any> = mutableListOf()

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun definition(vararg definition: Any) {
        _definition.addAll(listOf(*definition))
    }

    public fun definition(definition: Collection<Any>) {
        _definition.addAll(definition)
    }

    public fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition)
    }

    public fun definitionType(definitionType: String) {
        cdkBuilder.definitionType(definitionType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnServiceAction {
        if (_definition.isNotEmpty()) cdkBuilder.definition(_definition)
        return cdkBuilder.build()
    }
}
