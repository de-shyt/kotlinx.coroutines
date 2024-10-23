plugins {
    id("kotlinx-knit")
}

// TODO check that roots are correct
knit {
    siteRoot = "https://kotlinlang.org/api/kotlinx.coroutines"
    moduleRoots = listOf(".", "integration", "reactive", "ui")
    moduleDocs = "build/dokka/htmlPartial"
    dokkaMultiModuleRoot = "build/dokka/htmlMultiModule/"
}

tasks.named("knitPrepare") {
    dependsOn("dokka")
}
